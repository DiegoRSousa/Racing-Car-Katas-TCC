package com.uepb.tcc.racingcar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConversorPaginaHTML {

	private String nomeArquivo;
	private List<Integer> quebras = new ArrayList<Integer>();

	public ConversorPaginaHTML(String nomeArquivo) throws IOException {
		this.nomeArquivo = nomeArquivo;

		this.quebras.add(0);
		BufferedReader reader = new BufferedReader(new FileReader(this.nomeArquivo));
		int contagemCumulativaDeCaracteres = 0;
		String linha = reader.readLine();
		while (linha != null) {
			contagemCumulativaDeCaracteres += linha.length() + 1; // adiciona 1 para cada nova linha
			if (linha.contains("PAGE_BREAK")) {
				int posicao_quebra_pagina = contagemCumulativaDeCaracteres;
				quebras.add(posicao_quebra_pagina);
			}
			linha = reader.readLine();
		}
		reader.close();
	}

	public String getPaginaHtml(int pagina) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(this.nomeArquivo));
		reader.skip(quebras.get(pagina));
		StringBuffer paginaHtml = new StringBuffer();
		String linha = reader.readLine();
		while (linha != null) {
			if (linha.contains("PAGE_BREAK")) {
				break;
			}
			paginaHtml.append(StringEscapeUtils.escapeHtml(linha));
			paginaHtml.append("<br />");

			linha = reader.readLine();
		}
		reader.close();
		return paginaHtml.toString();
	}

	public String getNomeArquivo() {
		return this.nomeArquivo;
	}
}
