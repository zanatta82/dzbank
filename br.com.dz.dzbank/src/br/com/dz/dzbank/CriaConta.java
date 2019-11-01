package br.com.dz.dzbank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 20000;
		primeiraConta.agencia = 2189;
		primeiraConta.numero = 10128132;
		primeiraConta.titular = "Danilo Zanatta"; 
		
		System.out.println("Agência: " + primeiraConta.agencia);
		System.out.println("Conta Corrente: " + primeiraConta.numero);
		System.out.println("Nome Titular: " + primeiraConta.titular);
		System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 1000;
		
		System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 10000;
		
		System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);
		
	}
}
