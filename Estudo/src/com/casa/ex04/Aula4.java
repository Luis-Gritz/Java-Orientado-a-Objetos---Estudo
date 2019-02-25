package com.casa.ex04;

public class Aula4 {

	public static void main(String[] args) {
		
		ContaBancaria p1 = new ContaBancaria();
		
		p1.setNumConta(999);
		p1.setDono("Irineu");
		p1.abrirConta("cc");
		p1.depositar(100);
		p1.sacar(150);
		p1.fecharConta();
		
		ContaBancaria p2 = new ContaBancaria();
		
		p2.setNumConta(2222);
		p2.setDono("Creusa");
		p2.abrirConta("cp");
		p2.depositar(500);
		p2.sacar(10000);
		
		p1.estadoAtual();
		p2.estadoAtual();

	}

}
