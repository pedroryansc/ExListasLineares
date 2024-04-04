package ex6;

public class Main {
	public static void main(String[] args) {
		
		ListaCircular lista1 = new ListaCircular();
		
		lista1.inserirCrescente(5);
		lista1.inserirCrescente(14);
		lista1.inserirCrescente(3);
		lista1.inserirCrescente(7);
		
		lista1.mostrarLista();
		
		ListaCircular lista2 = new ListaCircular();
		
		lista2.inserirCrescente(9);
		lista2.inserirCrescente(7);
		lista2.inserirCrescente(8);
		lista2.inserirCrescente(2);
		
		lista2.mostrarLista();
		
		ListaCircular listaCombinada = ListaCircular.combinarListas(lista1, lista2);
		listaCombinada.mostrarLista();
		
	}
}