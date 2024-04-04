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
			Nodo aux = inicio;
			Nodo auxAnterior = null;
			while(aux != null) {
				if(aux == inicio.getProx())
					auxAnterior = inicio;
				
				if(novoNodo.getValor() < aux.getValor()) {
					if(inicio == fim || aux == inicio) {
						novoNodo.setProx(inicio);						
						inicio = novoNodo;
						fim.setProx(inicio);
						return;
					} else {
						novoNodo.setProx(aux);
						auxAnterior.setProx(novoNodo);
						return;
					}
				} else {
					if(aux == fim) {
						fim.setProx(novoNodo);
						fim = novoNodo;
						fim.setProx(inicio);
						return;
					}
				}
				aux = aux.getProx();
				if(auxAnterior != null)
					auxAnterior = auxAnterior.getProx();
			}
		}
	}
	
	public static ListaCircular combinarListas(ListaCircular lista1, ListaCircular lista2) {
		ListaCircular listaCombinada = new ListaCircular();
		
		Nodo aux = lista1.getInicio();
		do {
			listaCombinada.inserirCrescente(aux.getValor());
			aux = aux.getProx();
		} while(aux != lista1.getInicio());
		
		aux = lista2.getInicio();
		do {
			listaCombinada.inserirCrescente(aux.getValor());
			aux = aux.getProx();
		} while(aux != lista2.getInicio());
		
		return listaCombinada;
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