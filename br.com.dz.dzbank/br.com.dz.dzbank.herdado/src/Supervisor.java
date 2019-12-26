// Supervisor � um funcion�rio, Supervisor herda da class Funcionario, assina o contrato Autenticavel
public class Supervisor extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Supervisor() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("M�todo de Bonifica��o do Supervisor");
		return 100;
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}