package com.uepb.tcc.racingcar;

public class DistribuidorDeBilhete {

	public BilheteDeTurno getTurnTicket() {
		int novoNumeroTurno = NumeroSequenciaTurno.getProximoNumero();
		BilheteDeTurno novoBilheteDeTurno = new BilheteDeTurno(novoNumeroTurno);

		return novoBilheteDeTurno;
	}
}
