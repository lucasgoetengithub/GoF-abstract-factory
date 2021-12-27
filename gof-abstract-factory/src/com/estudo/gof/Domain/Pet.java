package com.estudo.gof.Domain;

abstract class Pet {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pet(String nome) {
		super();
		this.nome = nome;
	}

}
