package br.com.dz.dzbank;

public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(33, 2189, 10128132);
		
		System.out.println(conta.getBanco());
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente joao = new Cliente();
		
		joao.setNome("joao carlos zanatta neto");
		
		conta.setTitular(joao);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
		
	}

}
