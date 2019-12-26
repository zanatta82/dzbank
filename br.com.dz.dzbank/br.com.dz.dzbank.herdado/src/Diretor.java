// Diretor é um funcionário, Diretor herda da class Funcionario, assina o contrato Autenticavel
public class Diretor extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Diretor() {
		this.autenticador = new AutenticacaoUtil();
	} 
	
	@Override
	public double getBonificacao() {
		System.out.println("Método de Bonificação do Supervisor");
		return 150;
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