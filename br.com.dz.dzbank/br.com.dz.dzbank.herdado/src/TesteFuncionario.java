
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario danilo = new Funcionario();
		
		danilo.setNome("Danilo Zanatta");
		danilo.setCpf("040136159-40");
		danilo.setRg("7163745-0");
		danilo.setSalario(5400.00);
		
		System.out.println(danilo.getNome());
		System.out.println(danilo.getBonificacao());
		
	}

}
