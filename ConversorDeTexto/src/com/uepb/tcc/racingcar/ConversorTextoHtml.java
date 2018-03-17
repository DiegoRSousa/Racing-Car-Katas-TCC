package com.uepb.tcc.racingcar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConversorTextoHtml {

	private String nomeCompletoArquivoComCaminho;

	public ConversorTextoHtml(String nomeCompletoArquivoComCaminho) {
		this.nomeCompletoArquivoComCaminho = nomeCompletoArquivoComCaminho;
	}

	public String convertParaHtml() throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader(nomeCompletoArquivoComCaminho));

		String linha = reader.readLine();
		String html = "";
		while (linha != null) {
			html += StringEscapeUtils.escapeHtml(linha);
			html += "<br />";
			linha = reader.readLine();
		}
		return html;
	}

	public String getNomeArquivo() {
		return this.nomeCompletoArquivoComCaminho;
	}
}
