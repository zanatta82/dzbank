// Gerente � um funcion�rio, Administrador herda da class Funcion�rio Autentic�vel.
public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		System.out.println("M�todo de Bonifica��o do Administrador");
		return 50;
	}

}