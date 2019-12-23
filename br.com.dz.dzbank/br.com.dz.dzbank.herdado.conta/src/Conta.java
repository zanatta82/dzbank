

public abstract class Conta {

	private double saldo;
	private int banco;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	

	public Conta(int banco, int agencia, int numero) {
		Conta.total ++;
	//	System.out.println("O Total de Contas é " + Conta.total);
		this.banco = banco;
		this.agencia = agencia;
		this.numero = numero;
	//	this.saldo = 100; 
	//	System.out.println("Estou criando uma conta " + this.numero);

	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean tranfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Número da Conta não pode ser menor que zero!");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Número da Agência não pode ser menor que zero!");
			return;
		}
		this.agencia = agencia;
	}

	public int getBanco() {
		return this.banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}