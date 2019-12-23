// Gerente é um funcionário, Administrador herda da class Funcionário Autenticável.
public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		System.out.println("Método de Bonificação do Administrador");
		return 50;
	}

}