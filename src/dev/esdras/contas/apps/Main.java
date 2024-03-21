package dev.esdras.contas.apps;

import dev.esdras.contas.Conta;
import dev.esdras.contas.ContaEspecial;
import dev.esdras.contas.ContaInvestimento;

public class Main {

	public static void main(String[] args) {
		Conta conta1 = new Conta(01,01);
		Conta conta2 = new Conta(02,02);
		ContaEspecial contaesp1 = new ContaEspecial(1000,1000,1000);
		ContaInvestimento containvest1 = new ContaInvestimento(04,04,04,04,04);
		
		
		
		
		
		
		System.out.println("Saldo da conta 1: R$" + conta1.getSaldo());
		conta1.depositar(400);
		System.out.println("Saldo da conta 1 depois de depositar 400: R$" + conta1.getSaldo());
		
		System.out.println("Saldo conta investimento: R$" + containvest1.getSaldo());
		containvest1.depositar(6000);
		System.out.println("Saldo conta investimento depois de depositar 6000: R$" + containvest1.getSaldo());
		containvest1.aplicarRendimento(0.70);
		System.out.println("Saldo conta investimento depois de aplicar rendimento em um prazo de 365 dias: R$" + containvest1.getSaldo());
		
		System.out.println("Saldo da conta especial: R$" + contaesp1.getSaldo());
		contaesp1.sacar(500);
		System.out.println("Saldo da conta especial depois de sacar 500: R$" + contaesp1.getSaldo());
		contaesp1.depositar(1200);
		System.out.println("Saldo da conta especial depois de depositar 1200: R$" + contaesp1.getSaldo());


		
// ---------------------------------------EXERCÍCIO DA AULA PASSADA ---------------------------------
//		conta1.numero =1;
//		conta1.saldo = 10000;
//		//conta2.numero =2;
//		//conta2.saldo = 20000;
//		contaesp1.saldo = 25000;
//		contaesp1.limite = 8000;			
//		containvest1.saldo = 25000;
//		containvest1.prazo = 365;
//		containvest1.taxa = 0.01;
			
		
//		System.out.println("Número da conta 1: " + conta1.numero);
//		System.out.println("Número do saldo da conta 1: " + conta1.saldo);
		//System.out.println("Número da conta 2: " + conta2.numero);
		//System.out.println("Número do saldo da conta 2: " + conta2.saldo);
		
		//contaesp1.saldo = conta1.getSaldo();
//		contaesp1.sacar(500);
		
		
//		System.out.println("Atributo próprio de conta especial: Número do limite da conta especial: " + contaesp1.limite); //atributo dele
//		System.out.println("Atributo herdado de conta especial:(saldo de conta especial): " + contaesp1.saldo); //Atributo herdado de conta
//		
		//containvest1.saldo = conta1.getSaldo();
		//containvest1.saldo = containvest1.aplicarRendimento(0.70);
//		containvest1.aplicarRendimento(0.70);
		
//		System.out.println("Atributo próprio de conta investimento: Prazo de investimento da conta investimento: " + containvest1.prazo);
//		System.out.println("Atributo herdado de conta investimento: Valor do saldo da conta de investimento após o rendimento: " + containvest1.saldo);
	}

}
