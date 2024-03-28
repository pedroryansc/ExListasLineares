package ex2;

public class Produto {

	private String codigo;
	private double preco;
	private int quantEstoque;
	private Produto prox;
	
	public Produto(String codigo, double preco, int quantEstoque) {
		setCodigo(codigo);
		setPreco(preco);
		setQuantEstoque(quantEstoque);
		setProx(null);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantEstoque() {
		return quantEstoque;
	}

	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}

	public Produto getProx() {
		return prox;
	}

	public void setProx(Produto prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [codigo=");
		builder.append(codigo);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", quantEstoque=");
		builder.append(quantEstoque);
		builder.append(", prox=");
		builder.append(prox);
		builder.append("]");
		return builder.toString();
	}
	
}