package ex4;

import java.util.ArrayList;
import java.util.List;

public class ListaConjunto {

	private Nodo inicio;
	
	public ListaConjunto() {
		inicio = null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public List<Integer> uniao(ListaConjunto conjunto){
		List<Integer> uniao = new ArrayList<>();
		Nodo aux = inicio;
		while(aux != null) {
			uniao.add(aux.getValor());
			aux = aux.getProx();
		}
		aux = conjunto.getInicio();
		while(aux != null) {
			int cont = 0;
			for(int i = 0; i < uniao.size(); i++) {
				if(uniao.get(i) != aux.getValor())
					cont++;
			}
			if(cont == uniao.size())
				uniao.add(aux.getValor());
			aux = aux.getProx();
		}
		return uniao;
	}
	
	public List<Integer> interseccao(ListaConjunto conjunto){
		List<Integer> inter = new ArrayList<>();
		
		return inter;
	}
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public void mostraLista() {
		if(inicio == null) {
			System.out.println("Lista Vazia");
			return;
		}
		Nodo aux = inicio;
		while(aux != null) {
			System.out.print(aux.getValor() + "  ");
			aux = aux.getProx();
		}
		System.out.println();
	}
	
}