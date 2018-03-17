package com.uepb.tcc.distribuidordebilhetedeturno;

public class DistribuidorDeBilhete {

	public BilheteDeTurno getTurnTicket() {
		int novoNumeroTurno = NumeroSequenciaTurno.getProximoNumero();
		BilheteDeTurno novoBilheteDeTurno = new BilheteDeTurno(novoNumeroTurno);

		return novoBilheteDeTurno;
	}
}
