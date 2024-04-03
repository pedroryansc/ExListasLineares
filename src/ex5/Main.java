package ex5;

public class Main {
	public static void main(String[] args) {
		
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.inserirInicio(722);
		lista.inserirInicio(641);
		lista.inserirInicio(146);
		lista.inserirInicio(52);
		
		System.out.print("Lista: ");
		lista.mostraLista();
		
		System.out.print("Lista de trás para frente: ");
		lista.mostraListaInvertida();
		
	}
}