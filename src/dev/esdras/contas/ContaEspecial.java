package dev.esdras.contas;

public class ContaEspecial extends Conta {
	double limite;
	
	
	boolean sacar(double valor) {
		
		if (this.saldo >= valor) {
			this.saldo = this.saldo - (valor);
			return true;
		} else {
		return false;
		}
	}
}
