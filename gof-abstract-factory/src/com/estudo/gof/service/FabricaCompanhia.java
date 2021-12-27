package com.estudo.gof.service;

import com.estudo.gof.Domain.Cachorro;
import com.estudo.gof.Domain.Gato;
import com.estudo.gof.Domain.Persa;
import com.estudo.gof.Domain.Shitzu;
import com.estudo.gof.model.Modelo;

public class FabricaCompanhia implements Modelo {

	@Override
	public Cachorro getCachorro() {
		return new Shitzu();
	}

	@Override
	public Gato getGato() {
		return new Persa();
	}

}
