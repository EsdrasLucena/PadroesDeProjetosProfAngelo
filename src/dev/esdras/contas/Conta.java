package dev.esdras.contas;

public class Conta {
	private int numero;
	private double saldo;

		
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
		
	}

	public Conta() {
		super();
	}

	public Conta(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}


	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
		return false;
		}
	}
	
	public boolean depositar (double valor) {
		if(valor <=0) {
			return false;
		}else {
		this.saldo = this.saldo + valor;
		return true;
		}
	}
	
	
}
