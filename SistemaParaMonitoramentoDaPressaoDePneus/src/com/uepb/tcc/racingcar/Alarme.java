package com.uepb.tcc.racingcar;

public class Alarme {

	private final double limiteBaixaPressao = 17;
	private final double limiteAltaPressao = 21;

	public Sensor sensor = new Sensor();

	boolean alarmeLigado = false;

	public void verifica() {
		if (estaForaDolimite()) {
			alarmeLigado = true;
		}
	}
	
	private boolean estaForaDolimite() {
		double valorPressaoPsi = sensor.popValorPsiProximaPressao();
		return (valorPressaoPsi < limiteBaixaPressao || limiteAltaPressao < valorPressaoPsi);
	}

	public boolean isAlarmeLigado() {
		return alarmeLigado;
	}
}
