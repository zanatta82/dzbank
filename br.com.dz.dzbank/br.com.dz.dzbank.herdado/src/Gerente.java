// Gerente � um funcion�rio, Gerente herda da class Funcion�rio Autentic�vel.
public class Gerente extends FuncionarioAutenticavel{

	public double getBonificacao() {
		System.out.println("M�todo de Bonifica��o do Gerente");
		return super.getSalario();
	}

}