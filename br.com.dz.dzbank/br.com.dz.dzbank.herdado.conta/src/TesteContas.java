
public class TesteContas {

	public static void main(String[] args) {
	
		ContaCorrente cc = new ContaCorrente(260, 2190, 1012913);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(260, 2190, 2012913);
		cp.deposita(200.0);
		
		
		cc.tranfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
	}

}
