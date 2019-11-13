package br.com.dz.dzbank;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente danilo = new Cliente();
		danilo.nome = "Danilo Zanatta";
		danilo.cpf = "040.136.159-40";
		danilo.profissao = "Progrador";
		danilo.rg = "7.163.745-0";
		
		
		Conta contaDoDanilo = new Conta();
		contaDoDanilo.deposita(100);
		
		contaDoDanilo.titular = danilo;
		System.out.println(contaDoDanilo.titular.nome);
		System.out.println(contaDoDanilo.titular.cpf);
		System.out.println(contaDoDanilo.titular.profissao);
		System.out.println(contaDoDanilo.titular.rg);
		
	}

}
