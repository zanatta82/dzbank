public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("In�cio do Main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do Main");
	}

	public static void metodo1() {
		System.out.println("In�cio do M�todo 1");
		metodo2();
		System.out.println("Fim do M�todo 1");
	}

	private static void metodo2() {
		System.out.println("In�cio do M�todo 2");
		metodo3();
		System.out.println("Fim do M�todo 2");
	}

	private static void metodo3() {
		System.out.println("In�cio do M�todo 3");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;

			//Conta c = null;
			//c.deposita();
		}
		System.out.println("Fim do M�todo 3");
	}
}