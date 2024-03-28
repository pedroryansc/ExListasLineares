package ex2;

public class Main {
	public static void main(String[] args) {
		
		ListaProdutos lista = new ListaProdutos();
		
		lista.inserirInicio("FN9500", 55.99, 140);
		lista.inserirInicio("220224", 15, 60);
		lista.inserirInicio("290224", 20, 1000);
		
		lista.mostrarLista();
		
		lista.aplicarTaxa(10);
		
	}
}