// n�o pode instanciar(criar objetos) dessa classe, pq � abstrata. 
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private String rg;
	private double salario;

	// m�todo sem corpo, n�o h� implementa��o. 
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}