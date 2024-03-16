package dev.esdras.contas;

public class Conta {
	int numero;
	double saldo;


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	double getSaldo() {
		return this.saldo;
		
	}

	boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
		return false;
		}
	}
	
	boolean depositar (double valor) {
		if(valor <=0) {
			return false;
		}else {
		this.saldo = this.saldo + valor;
		return true;
		}
	}
	
	
}
