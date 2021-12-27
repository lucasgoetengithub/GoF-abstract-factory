package com.estudo.gof.application;

import java.util.Scanner;

import com.estudo.gof.model.Modelo;
import com.estudo.gof.service.FabricaCompanhia;
import com.estudo.gof.service.FabricaGuarda;

public class AbsFac {

	public static void main(String[] args) {
		executar();
	}
	
	public static void executar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe 1 para guarda 2 para companhia");
		byte opc = sc.nextByte();
		Modelo modelo = null;
		switch (opc) {
		case 1: modelo = new FabricaGuarda();break;
		case 2: modelo = new FabricaCompanhia();break;
		}
		
		System.out.println("Cachorro: " + modelo.getCachorro().getNome());
		System.out.println("Gato: " + modelo.getGato().getNome());
		
		sc.close();
	}
}
