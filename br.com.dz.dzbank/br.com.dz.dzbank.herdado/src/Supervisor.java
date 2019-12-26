// Supervisor � um funcion�rio, Supervisor herda da class Funcionario, assina o contrato Autenticavel
public class Supervisor extends Funcionario implements Autenticavel {

	private int senha; 
	
	@Override
	public double getBonificacao() {
		System.out.println("M�todo de Bonifica��o do Supervisor");
		return 100;
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}