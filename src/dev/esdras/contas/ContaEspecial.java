package dev.esdras.contas;

public class ContaEspecial extends Conta {
	private double limite;
	
	
	public ContaEspecial() {
		super();
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}


	public boolean sacar(double valor) {
		
		if (getSaldo() >= valor) {
			double novoSaldo = getSaldo() - (valor);
			setSaldo(novoSaldo);
			return true;
		} else {
		return false;
		}
	}
}
