package br.com.dz.dzbank;

public class TesteReferencia {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 3000;
		
		System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 1000; 
		
		System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);
		System.out.println("Saldo da Segunda Conta: " + primeiraConta.saldo);
		
	}

}
