
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente danilo = new Gerente();
		
		danilo.setNome("Danilo Zanatta");
		danilo.setCpf("040136159-40");
		danilo.setRg("7163745-0");
		danilo.setSalario(5400.00);
		
		System.out.println(danilo.getNome());
		System.out.println(danilo.getBonificacao());
		
	}

}
