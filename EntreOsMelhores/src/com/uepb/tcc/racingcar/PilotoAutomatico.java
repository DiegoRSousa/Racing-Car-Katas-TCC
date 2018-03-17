package com.uepb.tcc.racingcar;

public class PilotoAutomatico extends Piloto {

	private String versaoDoAlgoritmo;

	public PilotoAutomatico(String versaoDoAlgoritmo, String compania) {
		super(versaoDoAlgoritmo, compania);
		this.versaoDoAlgoritmo = versaoDoAlgoritmo;
	}

	public String getVersaoDoAlgoritmo() {
		return versaoDoAlgoritmo;
	}

	public void setVersaoDoAlgoritmo(String versaoDoAlgoritmo) {
		this.versaoDoAlgoritmo = versaoDoAlgoritmo;
	}

}
