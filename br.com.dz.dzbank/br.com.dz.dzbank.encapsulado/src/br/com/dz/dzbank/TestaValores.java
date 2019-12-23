package br.com.dz.dzbank;

public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(260, 0001, 3465716-9);

		System.out.println(conta.getBanco());
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(2620, 2001, 67874316-9);
		
		System.out.println(Conta.getTotal());
	}
}