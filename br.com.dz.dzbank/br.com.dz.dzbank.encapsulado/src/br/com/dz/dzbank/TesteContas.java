package br.com.dz.dzbank;

public class TesteContas {
	
	public static void main (String [] arg) {
					
	Conta conta = new Conta(1337, 23334, 365);		
	
	conta.deposita(200.00);
	
	System.out.println(conta.getSaldo());
	
	conta.setAgencia(579);
	
	System.out.println(conta.getAgencia());
	
	System.out.println("O Total de contas é: " + Conta.getTotal());
			
	}

}