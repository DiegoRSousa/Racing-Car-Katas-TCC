package com.uepb.tcc.racingcar;

public class Alarme {

	private final double limiteBaixaPressao = 17;
	private final double limiteAltaPressao = 21;

	Sensor sensor = new Sensor();

	boolean alarmeLigado = false;

	public void verifica() {
		double valorPressaoPsi = sensor.popValorPsiProximaPressao();

		if (valorPressaoPsi < limiteBaixaPressao || limiteAltaPressao < valorPressaoPsi) {
			alarmeLigado = true;
		}
	}

	public boolean isAlarmeLigado() {
		return alarmeLigado;
	}
}
