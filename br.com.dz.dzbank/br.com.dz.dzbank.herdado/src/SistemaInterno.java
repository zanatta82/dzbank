
public class SistemaInterno {
	
	private int senha = 2222; 
	
	public void autentica (Autenticavel fa) {
		
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode acessar no Sistema");
		} else {
			System.out.println("N�o pode acessar o sistema");
		}
	}

}
