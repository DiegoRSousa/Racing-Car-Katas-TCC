package com.uepb.tcc.entreosmelhores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntreOsMelhores {

	private final List<Corrida> corrida;

	public EntreOsMelhores(Corrida... corrida) {
		this.corrida = Arrays.asList(corrida);
	}

	public Map<String, Integer> resultadoDosPilotos() {
		Map<String, Integer> resultados = new HashMap<>();
		for (Corrida corrida : this.corrida) {
			for (Piloto piloto : corrida.getResultados()) {
				String nomeDoPiloto = corrida.getNomeDoPiloto(piloto);
				int pontos = corrida.getPontos(piloto);
				if (resultados.containsKey(nomeDoPiloto)) {
					resultados.put(nomeDoPiloto, resultados.get(nomeDoPiloto) + pontos);
				} else {
					resultados.put(nomeDoPiloto, 0 + pontos);
				}
			}
		}
		return resultados;
	}

	public List<String> RankingsPiloto() {
		Map<String, Integer> resultados = resultadoDosPilotos();
		List<String> listaDeResultados = new ArrayList<>(resultados.keySet());
		Collections.sort(listaDeResultados, new ComparadorDescendentePorPontosPiloto(resultados));
		return listaDeResultados;
	}

	private static final class ComparadorDescendentePorPontosPiloto implements Comparator<String> {
		private final Map<String, Integer> resultados;

		private ComparadorDescendentePorPontosPiloto(Map<String, Integer> resultados) {
			this.resultados = resultados;
		}

		@Override
		public int compare(String nomeDoPiloto1, String nomeDoPiloto2) {
			return -resultados.get(nomeDoPiloto1).compareTo(resultados.get(nomeDoPiloto2));
		}
	}
}
