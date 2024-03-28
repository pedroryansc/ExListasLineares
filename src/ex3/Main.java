package ex3;

public class Main {
	public static void main(String[] args) {
		
		ListaCircular lista = new ListaCircular();
		
		lista.inserirInicio(14);
		lista.inserirInicio(7);
		lista.inserirInicio(5);
		lista.inserirInicio(23);
		lista.inserirInicio(8);
		
		lista.mostrarLista();
		
		lista.verificaMaior();
		lista.verificaMenor();
		lista.calcularMedia();
		
	}
}