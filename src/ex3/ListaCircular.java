package ex3;

public class ListaCircular {

	private Nodo inicio;
	private Nodo fim;
	
	public ListaCircular() {
		inicio = null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void verificaMaior() {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return;
		}
		Nodo aux = inicio;
		double maior = 0;
		do {
			if(aux == inicio)
				maior = aux.getValor();
			else {
				if(aux.getValor() > maior)
					maior = aux.getValor();
			}
			aux = aux.getProx();
		} while(aux != inicio);
		System.out.println("Maior elemento: " + maior);
	}
	
	public void verificaMenor() {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return;
		}
		Nodo aux = inicio;
		double menor = 0;
		do {
			if(aux == inicio)
				menor = aux.getValor();
			else {
				if(aux.getValor() < menor)
					menor = aux.getValor();
			}
			aux = aux.getProx();
		} while(aux != inicio);
		System.out.println("Menor elemento: " + menor);
	}
	
	public void calcularMedia() {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return;
		}
		Nodo aux = inicio;
		double soma = 0;
		int quant = 0;
		do {
			soma += aux.getValor();
			quant++;
			aux = aux.getProx();
		} while(aux != inicio);
		double media = soma / quant;
		System.out.println("Média aritmética dos elementos: " + media);
	}
	
	public void inserirInicio(double valor) {
		Nodo novoNodo = new Nodo(valor);
		if(inicio == null) { // Caso a lista esteja vazia
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		} else { // Caso a lista não esteja vazia
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			fim.setProx(inicio);
		}
	}
	
	public void mostrarLista() {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return;
		}
		Nodo aux = inicio;
		do {
			System.out.print(aux.getValor() + "  ");
			aux = aux.getProx();
		} while(aux != inicio);
		System.out.println();
	}
	
}