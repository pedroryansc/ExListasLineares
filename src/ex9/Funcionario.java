package ex9;

public class Funcionario {

	private String nome;
	private float salario;
	private Funcionario prox;
	
	public Funcionario(String nome, float salario) {
		setNome(nome);
		setSalario(salario);
		setProx(null);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public Funcionario getProx() {
		return prox;
	}
	
	public void setProx(Funcionario prox) {
		this.prox = prox;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [nome=");
		builder.append(nome);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", prox=");
		builder.append(prox);
		builder.append("]");
		return builder.toString();
	}
	
}