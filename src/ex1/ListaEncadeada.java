package ex1;

import java.util.ArrayList;
import java.util.List;

public class ListaEncadeada {

	private Nodo inicio;

	public ListaEncadeada() {
		inicio = null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void quantidadeNodos(Nodo inicio, int valor) {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return;
		}
		
		int totalNodos = 0;
		int totalComValor = 0;
		List<Integer> posicoes = new ArrayList<>();
		int totalMaiores = 0;
		
		Nodo aux = inicio;
		while(aux != null) {
			totalNodos++;
			if(aux.getValor() == valor) {
				totalComValor++;
				posicoes.add(totalNodos);
			} else if(aux.getValor() > valor)
				totalMaiores++;
			aux = aux.getProx();
		}
		System.out.println("Quantidade de nodos na lista: " + totalNodos);
		System.out.println("Quantidade de nodos com valor igual ao número enviado: " + totalComValor + " - Posições: " + posicoes);
		System.out.println("Quantidade de nodos com valor maior que o número enviado: " + totalMaiores);
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
			System.out.print(aux.getValor() + " ");
			aux = aux.getProx();
		}
		System.out.println();
	}
	
}