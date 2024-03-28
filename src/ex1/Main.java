package ex1;

public class Main {
	public static void main(String[] args) {
		
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.inserirInicio(5);
		lista.inserirInicio(7);
		lista.inserirInicio(5);
		lista.inserirInicio(4);
		
		lista.mostraLista();
		
		lista.quantidadeNodos(lista.getInicio(), 5);
		
	}
}