public class Fluxo {

	public static void main(String[] args) {
		System.out.println("In�cio do Main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do Main");
	}

	public static void metodo1() throws MinhaExcecao {
		System.out.println("In�cio do M�todo 1");
		metodo2();
		System.out.println("Fim do M�todo 1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("In�cio do M�todo 2");
		metodo3();
		System.out.println("Fim do M�todo 2");
	}

	private static void metodo3() throws MinhaExcecao {
		System.out.println("In�cio do M�todo 3");
		
		throw new MinhaExcecao("deu muito errado");
		
		//System.out.println("Fim do M�todo 3");
	}
}