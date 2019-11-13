package br.com.dz.dzbank;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaAndressa = new Conta();
		System.out.println(contaAndressa.getSaldo());
		
		contaAndressa.titular = new Cliente();
		System.out.println(contaAndressa.titular);
		
		contaAndressa.titular.nome = "Janaina Andressa";
		contaAndressa.titular.cpf = "043.574.469-02";
		System.out.println(contaAndressa.titular.nome);
		System.out.println(contaAndressa.titular.cpf);
		
	}

}
