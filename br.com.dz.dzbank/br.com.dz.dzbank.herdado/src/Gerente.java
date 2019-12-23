// Gerente é um funcionário, Gerente herda da class Funcionário Autenticável.
public class Gerente extends FuncionarioAutenticavel{

	public double getBonificacao() {
		System.out.println("Método de Bonificação do Gerente");
		return super.getSalario();
	}

}