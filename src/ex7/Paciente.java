package ex7;

public class Paciente {

	private String nome;
	private int prioridade;
	private Paciente prox;
	
	public Paciente(String nome, int prioridade) {
		setNome(nome);
		setPrioridade(prioridade);
		setProx(null);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public Paciente getProx() {
		return prox;
	}

	public void setProx(Paciente prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [nome=");
		builder.append(nome);
		builder.append(", prioridade=");
		builder.append(prioridade);
		builder.append(", prox=");
		builder.append(prox);
		builder.append("]");
		return builder.toString();
	}
	
}