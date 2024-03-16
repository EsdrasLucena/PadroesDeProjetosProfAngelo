package dev.esdras.contas;

public class ContaInvestimento extends Conta {
	
		double taxa;
		int prazo;
		
		
		boolean sacar(double valor) {
			if (this.saldo >= valor) {
				this.saldo = this.saldo - (valor* 0.99);
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
		
		public double aplicarRendimento (double taxa){
			if(taxa>0 && taxa<1) {
				double rendimento = getSaldo() * Math.pow(1 + taxa,prazo) - getSaldo();
				//setSaldo(getSaldo() + rendimento);
				setSaldo(getSaldo() + rendimento);
				return saldo;
			}else {
				System.out.println("Taxa inválida");
				return -1;
			}
		}
}
