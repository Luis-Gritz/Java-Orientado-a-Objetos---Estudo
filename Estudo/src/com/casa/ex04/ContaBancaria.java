package com.casa.ex04;

public class ContaBancaria {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public ContaBancaria() {

		this.setNumConta(numConta);
		this.setTipo(tipo);
		this.setDono(dono);
		this.setSaldo(0);
		this.setStatus(false);

	}

	public void estadoAtual() {

		System.out.println("------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());

	}

	public boolean getStatus() {

		return status;
	}

	public void setStatus(boolean s) {

		this.status = s;
	}

	public void abrirConta(String t) {

		this.setTipo(t);
		this.setStatus(true);

		if (t.equals("cc")) {

			this.setSaldo(50);

		} else if (t.equals("cp")) {

			this.setSaldo(150);

		}

	}

	public void fecharConta() {
		if (this.getSaldo() > 0 || this.getSaldo() < 0) {

			System.out.println(
					"A conta :" + this.numConta + " não foi fechada, pois ainda tem :" + this.saldo + " R$ constando.");

		} else {

			this.setStatus(false);
			System.out.println("A conta :" + this.numConta + " foi fechada.");

		}
	}

	public void depositar(float v) {

		if (this.getStatus()) {

			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado na conta de: " + this.getDono());

		} else {

			System.out.println("Falha na operação de deposito");

		}

	}

	public void sacar(float v) {

		if (this.getStatus()) {

			if (this.getSaldo() >= v) {

				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de: " + this.getDono());

			} else {

				System.out.println("Saldo Insuficiente");

			}
		} else {

			System.out.println("Impossível sacar de uma conta fechada");

		}
	}

	public void pagarMensal() {

		int v = 0;

		if (this.getTipo().equals("cc")) {

			v = 12;

		} else if (this.getTipo().equals("cp")) {

			v = 20;
		}
		if (this.getStatus()) {

			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por: " + this.getDono());

		} else {

			System.out.println("Impossível pagar, pois a conta está fechada.");
		}

	}

	public int getNumConta() {

		return numConta;
	}

	public void setNumConta(int numConta) {

		this.numConta = numConta;

	}

	public String getTipo() {

		return this.tipo;
	}

	public void setTipo(String t) {
		
		this.tipo = t;
	}

	public String getDono() {

		return this.dono;
	}

	public void setDono(String dono) {

		this.dono = dono;
	}

	public float getSaldo() {

		return this.saldo;
	}

	public void setSaldo(float s) {

		this.saldo = s;

	}

}
