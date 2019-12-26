public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Início do Main");
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
		System.out.println("Início do Método 1");
		metodo2();
		System.out.println("Fim do Método 1");
	}

	private static void metodo2() {
		System.out.println("Início do Método 2");
		metodo3();
		System.out.println("Fim do Método 2");
	}

	private static void metodo3() {
		System.out.println("Início do Método 3");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;

			//Conta c = null;
			//c.deposita();
		}
		System.out.println("Fim do Método 3");
	}
}