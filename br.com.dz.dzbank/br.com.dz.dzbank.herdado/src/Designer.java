// Designer é um funcionário, Designer herda da class Funcionário.
public class Designer extends Funcionario{

	public double getBonificacao() {
		System.out.println("Método de Bonificação do Designer");
		return 200;
	}

}