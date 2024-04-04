package ex8;

public class Fila {

	private Nodo inicio;
	private Nodo fim;
	private int tamanho = 0;
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	public void inserir(int dado) {
		Nodo novoItem = new Nodo(dado);
		if(estaVazia())
			inicio = novoItem;
		else
			fim.setProx(novoItem);
		fim = novoItem;
		tamanho++;
	}
	
	public static void separaValores(Fila f, Fila f_impares, Fila f_pares) {
		Nodo aux = f.getInicio();
		while(aux != null) {
			if(aux.getValor() % 2 != 0)
				f_impares.inserir(aux.getValor());
			else
				f_pares.inserir(aux.getValor());
			aux = aux.getProx();
		}
		System.out.println("Fila com todos os valores: ");
		f.mostrarFila();
		System.out.println("Fila com valores ímpares: ");
		f_impares.mostrarFila();
		System.out.println("Fila com valores pares: ");
		f_pares.mostrarFila();
	}
	
	public void mostrarFila() {
		if(estaVazia()) {
			System.out.println("A fila está vazia");
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