package com.casa.ex02;

import com.casa.ex02.Caneta;

public class Aula02 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		Caneta c2 = new Caneta();

		c1.modelo = "Bic";
		c1.cor = "Azul";
		// c1.ponta = 0.5f;
		c1.carga = 10;
		// c1.tampada = false;

		c1.tampar();
		c1.status();
		c1.rabiscar();
		System.out.println(" ");
		c2.status();

	}

}