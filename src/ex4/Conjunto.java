package ex4;

import java.util.ArrayList;
import java.util.List;

public class Conjunto {

	private Nodo inicio;
	
	public Conjunto() {
		inicio = null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public List<Integer> uniao(Conjunto conjunto){
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
	
	public List<Integer> interseccao(Conjunto conjunto){
		List<Integer> listaAux = new ArrayList<>();
		Nodo aux = inicio;
		while(aux != null) {
			listaAux.add(aux.getValor());
			aux = aux.getProx();
		}
		aux = conjunto.getInicio();
		List<Integer> inter = new ArrayList<>();
		while(aux != null) {
			int cont = 0;
			for(int i = 0; i < listaAux.size(); i++) {
				if(aux.getValor() != listaAux.get(i))
					cont++;
			}
			int cont2 = 0;
			if(cont != listaAux.size()) {
				for(int i = 0; i < inter.size(); i++) {
					if(aux.getValor() != inter.get(i))
						cont2++;
				}
				if(cont2 == inter.size())
					inter.add(aux.getValor());
			}
			aux = aux.getProx();
		}
		return inter;
	}
	
	public List<Integer> diferenca(Conjunto conjunto){
		List<Integer> dif = new ArrayList<>();
		Nodo aux = inicio;
		while(aux != null) {
			dif.add(aux.getValor());
			aux = aux.getProx();
		}
		aux = conjunto.getInicio();
		while(aux != null) {
			int cont = 0;
			for(int i = 0; i < dif.size(); i++) {
				if(aux.getValor() == dif.get(i))
					dif.remove(i);
				else
					cont++;
			}
			if(cont == dif.size())
				dif.add(aux.getValor());
			aux = aux.getProx();
		}
		return dif;
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