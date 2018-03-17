package com.uepb.tcc.racingcar;

import java.util.Random;

//A leitura do valor da press�o do sensor � simulado nesta implementa��o
//Porque o foco deste exerc�cio est� em outra classe

public class Sensor {
	public static final double OFFSET = 16;

	public double popValorPsiProximaPressao() {
		double valorTelemetriaPressao;
		valorTelemetriaPressao = pressaoDeAmostra();

		return OFFSET + valorTelemetriaPressao;
	}

	private static double pressaoDeAmostra() {
		// implementa��o que simula um sensor real em um pneu real
		Random geradorBasicoNumeroAleatorio = new Random();
		double valorTelemetriaPressao = 6 * geradorBasicoNumeroAleatorio.nextDouble()
				* geradorBasicoNumeroAleatorio.nextDouble();
		return valorTelemetriaPressao;
	}
}
