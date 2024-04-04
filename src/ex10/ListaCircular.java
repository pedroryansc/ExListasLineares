package ex10;

import java.util.ArrayList;
import java.util.List;

public class ListaCircular {

	private Nodo inicio;
	private Nodo fim;
	
	public ListaCircular() {
		inicio = null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}

	public void receberDados(ListaCircular l1) {
		Nodo nodoL1 = l1.getInicio();
		
		List<Nodo> listaAux = new ArrayList<>();
		listaAux.add(nodoL1);
		
		System.out.println(listaAux.get(0));
		
		for(int i = 0; i < listaAux.size(); i++) {
			if(inicio == null) {
				inicio = listaAux.get(i);
				inicio.setProx(inicio);
				fim = inicio;
			} else {
				Nodo aux = inicio;
				Nodo auxAnterior = null;
				do {
					if(aux == inicio.getProx())
						auxAnterior = inicio;
					
					if(listaAux.get(i).getValor() < aux.getValor()) {
						if(inicio == fim || aux == inicio) {
							listaAux.get(i).setProx(inicio);
							inicio = listaAux.get(i);
							fim.setProx(inicio);
						} else {
							listaAux.get(i).setProx(aux);
							auxAnterior.setProx(listaAux.get(i));
						}
					} else {
						if(aux == fim) {
							fim.setProx(listaAux.get(i));
							fim = listaAux.get(i);
							fim.setProx(inicio);
						}
					}
					
					System.out.print(aux.getValor() + "  ");
					
					aux = aux.getProx();
					if(auxAnterior != null)
						auxAnterior = auxAnterior.getProx();
				} while(aux != inicio);
			}
			nodoL1 = nodoL1.getProx();
		}
	}
	
	public void inserirInicio(int valor) {
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
		int cont = 0;
		do {
			cont++;
			System.out.println(cont + " - " + aux.getValor() + "  ");
			aux = aux.getProx();
		} while(aux != inicio);
		System.out.println();
	}
	
}