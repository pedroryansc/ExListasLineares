package ex6;

public class ListaCircular {

	private Nodo inicio;
	private Nodo fim;
	
	public ListaCircular() {
		inicio = null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void inserirCrescente(int valor) {
		Nodo novoNodo = new Nodo(valor);
		if(inicio == null) { // Caso a lista esteja vazia
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		} else { // Caso a lista não esteja vazia
			if(novoNodo.getValor() <= inicio.getValor()) {
				novoNodo.setProx(inicio);
				inicio = novoNodo;
				fim.setProx(inicio);
			} else {
				Nodo aux = inicio.getProx();
				do {
					if(novoNodo.getValor() <= aux.getValor()) {
						
					}
					aux = aux.getProx();
				} while(aux != inicio);
			}
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