package com.estudo.gof.service;

import com.estudo.gof.Domain.Cachorro;
import com.estudo.gof.Domain.Gato;
import com.estudo.gof.Domain.Pastor;
import com.estudo.gof.Domain.RagDoll;
import com.estudo.gof.model.Modelo;

public class FabricaGuarda implements Modelo {

	@Override
	public Cachorro getCachorro() {
		return new Pastor();
	}

	@Override
	public Gato getGato() {
		return new RagDoll();
	}

}
