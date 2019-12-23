
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int banco, int agencia, int numero) {
		super(banco, agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

}
