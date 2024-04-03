package ex5;

public class ListaEncadeada {

	private Nodo inicio;

	public ListaEncadeada() {
		inicio = null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void mostraListaInvertida() {
		Nodo aux = inicio;
		int cont = 0;
		while(aux != null) {
			cont++;
			aux = aux.getProx();
		}
		while(cont > 0) {
			aux = inicio;
			for(int i = 1; i < cont; i++)
				aux = aux.getProx();
			System.out.print(aux.getValor() + " ");
			cont--;
		}
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