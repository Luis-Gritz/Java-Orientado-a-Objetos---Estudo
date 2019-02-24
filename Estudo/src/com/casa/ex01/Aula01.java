package com.casa.ex01;

public class Aula01 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		Caneta c2 = new Caneta();
		
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.carga = 70;
		c1.ponta = 1.5f;
		c1.tampada = true;
		
		c2.modelo = "Faber";
		c2.cor = "Vermelha";
		c2.carga = 20;
		c2.ponta = 2.0f;
		c2.tampada = false;
		
		
		c1.status();
		c1.destampar();
		c1.rabiscar();
		System.out.println(" ");
		c2.status();
		c2.tampar();
		c2.rabiscar();

	}

}
