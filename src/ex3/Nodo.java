package ex3;

public class Nodo {

	private double valor;
	private Nodo prox;
	
	public Nodo(double valor) {
		setValor(valor);
		setProx(null);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nodo [valor=");
		builder.append(valor);
		builder.append(", prox=");
		builder.append(prox);
		builder.append("]");
		return builder.toString();
	}
	
}