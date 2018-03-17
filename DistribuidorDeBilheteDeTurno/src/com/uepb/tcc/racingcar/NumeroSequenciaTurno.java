package com.uepb.tcc.racingcar;

public class NumeroSequenciaTurno {

	private static int _numeroTurno = 0;

	public static int getProximoNumero() {
		return _numeroTurno++;
	}
}
