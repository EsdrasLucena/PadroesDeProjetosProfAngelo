package dev.esdras.contas;

public class Main {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		ContaEspecial contaesp1 = new ContaEspecial();
		ContaInvestimento containvest1 = new ContaInvestimento();
		
		conta1.numero =1;
		conta1.saldo = 10000;
		//conta2.numero =2;
		//conta2.saldo = 20000;
		contaesp1.limite = 8000;
		containvest1.prazo = 365;
		containvest1.taxa = 0.01;
			
		
		System.out.println("Número da conta 1: " + conta1.numero);
		System.out.println("Número do saldo da conta 1: " + conta1.saldo);
		//System.out.println("Número da conta 2: " + conta2.numero);
		//System.out.println("Número do saldo da conta 2: " + conta2.saldo);
		
		contaesp1.saldo = conta1.getSaldo();
		contaesp1.sacar(500);
		
		
		System.out.println("Atributo próprio de conta especial: Número do limite da conta especial: " + contaesp1.limite); //atributo dele
		System.out.println("Atributo herdado de conta especial:(saldo de conta especial): " + contaesp1.saldo); //Atributo herdado de conta
		
		containvest1.saldo = conta1.getSaldo();
		containvest1.saldo = containvest1.aplicarRendimento(0.70);
		
		System.out.println("Atributo próprio de conta investimento: Prazo de investimento da conta investimento: " + containvest1.prazo);
		System.out.println("Atributo herdado de conta investimento: Valor do saldo da conta de investimento após o rendimento: " + containvest1.saldo);
	}

}
