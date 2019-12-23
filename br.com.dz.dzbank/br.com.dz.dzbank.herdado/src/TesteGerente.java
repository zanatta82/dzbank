
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Janaina");
		g1.setCpf("043574469-02");
		g1.setRg("982742049");
		g1.setSalario(3000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getRg());
		System.out.println(g1.getCpf());
		
		g1.setSenha(280901);
		boolean autenticou = g1.autentica(280901);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
