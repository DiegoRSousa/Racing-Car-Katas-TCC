package com.uepb.tcc.racingcar;

import java.util.Random;

//A leitura do valor da pressão do sensor é simulado nesta implementação
//Porque o foco deste exercício está em outra classe

public class Sensor {
	public static final double OFFSET = 16;

	public double popValorPsiProximaPressao() {
		double valorTelemetriaPressao;
		valorTelemetriaPressao = pressaoDeAmostra();

		return OFFSET + valorTelemetriaPressao;
	}

	private static double pressaoDeAmostra() {
		// implementação que simula um sensor real em um pneu real
		Random geradorBasicoNumeroAleatorio = new Random();
		double valorTelemetriaPressao = 6 * geradorBasicoNumeroAleatorio.nextDouble()
				* geradorBasicoNumeroAleatorio.nextDouble();
		return valorTelemetriaPressao;
	}
}
