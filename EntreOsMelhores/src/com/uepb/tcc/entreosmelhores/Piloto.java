package com.uepb.tcc.entreosmelhores;

public class Piloto {

	private final String nome;
	private final String pais;

	public Piloto(String nome, String pais) {
		this.nome = nome;
		this.pais = pais;
	}

	public String getNome() {
		return nome;
	}

	public String getPais() {
		return pais;
	}

	@Override
	public int hashCode() {
		return nome.hashCode() * 31 + pais.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || !(obj instanceof Piloto)) {
			return false;
		}
		Piloto other = (Piloto) obj;
		return this.nome.equals(other.nome) && this.pais.equals(other.pais);
	}
}
