// Editor de Vídeo é um funcionário, Editor de Vídeo herda da class Funcionário.
public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("Método de Bonificação do Editor de Vídeo");
		return super.getBonificacao() + 100;
	}

}