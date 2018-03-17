package com.uepb.tcc.entreosmelhores;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Corrida {

	private static final Integer[] PONTOS = new Integer[]{25, 18, 15};

    private final String nome;
    private final List<Piloto> resultados;
    private final Map<Piloto, String> nomesDosPilotos;

	public Corrida(String nome, Piloto... pilotos) {
        this.nome = nome;
        this.resultados = Arrays.asList(pilotos);
        this.nomesDosPilotos = new HashMap<>();
        for (Piloto piloto : resultados) {
            String nomeDoPiloto = piloto.getNome();
            if (piloto instanceof PilotoAutomatico) {
                nomeDoPiloto = "Piloto automatico - " + piloto.getPais() + " (" + ((PilotoAutomatico) piloto).getVersaoDoAlgoritmo() + ")";
            }
            this.nomesDosPilotos.put(piloto, nomeDoPiloto);
        }
    }

    public int posicao(Piloto piloto) {
        return this.resultados.indexOf(piloto);
    }

    public int getPontos(Piloto piloto) {
        return Corrida.PONTOS[posicao(piloto)];
    }

    public List<Piloto> getResultados() {
        return resultados;
    }

    public String getNomeDoPiloto(Piloto piloto) {
        return this.nomesDosPilotos.get(piloto);
    }

    @Override
    public String toString() {
        return nome;
    }
}
