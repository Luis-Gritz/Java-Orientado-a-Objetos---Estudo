package com.casa.ex02;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;

	public void status() {

		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampa: " + this.tampada);

	}

	public void rabiscar() {
		if (this.tampada == true) {

			System.out.println("Erro, a caneta est� tampada");

		} else {

			System.out.println("Estou rabiscando");
		}

	}

	public void tampar() {

		this.tampada = true;

	}

	public void destampar() {

		this.tampada = false;

	}
}
