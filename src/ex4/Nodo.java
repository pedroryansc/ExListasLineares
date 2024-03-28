package ex4;

public class Nodo {

	private int valor;
	private Nodo prox;
	
	public Nodo(int valor) {
		setValor(valor);
		setProx(null);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
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