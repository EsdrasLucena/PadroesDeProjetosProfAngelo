package dev.esdras.contas;

public class ContaInvestimento extends Conta {
		
		private double taxa;
		private int prazo;
		public ContaInvestimento() {
		super();
	}


		public ContaInvestimento(int numero, double saldo, double limite, double taxa, int prazo) {
		super(numero,saldo);
		this.taxa = taxa;
		this.prazo = prazo;
	}

		
		
		
		public double getTaxa() {
			return taxa;
		}


		public void setTaxa(double taxa) {
			this.taxa = taxa;
		}


		public int getPrazo() {
			return prazo;
		}


		public void setPrazo(int prazo) {
			this.prazo = prazo;
		}


		public boolean sacar(double valor) {
			if (getSaldo() >= valor) {
				double novoSaldo = getSaldo() - (valor* 0.99);
				setSaldo(novoSaldo);
				return true;
			} else {
			return false;
			}
		}
		
		
		public boolean depositar (double valor) {
			if(valor <=0) {
				return false;
			}else {
			double novoSaldo = getSaldo() + valor;
			setSaldo(novoSaldo);
			return true;
			}
		}
		
		public double aplicarRendimento (double taxa){
			if(taxa>0 && taxa<1) {
				double rendimento = getSaldo() * Math.pow(1 + taxa,prazo) - getSaldo();
				//setSaldo(getSaldo() + rendimento);
				setSaldo(getSaldo() + rendimento);
				return getSaldo();
			}else {
				System.out.println("Taxa inválida");
				return -1;
			}
		}
}
