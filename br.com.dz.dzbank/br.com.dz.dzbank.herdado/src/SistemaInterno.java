
public class SistemaInterno {
	
	private int senha = 3333; 
	
	public void autentica (FuncionarioAutenticavel fa) {
		
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode acessar no Sistema");
		} else {
			System.out.println("Não pode acessar o sistema");
		}
	}

}
