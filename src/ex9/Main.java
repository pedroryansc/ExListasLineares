package ex9;

public class Main {
	public static void main(String[] args) {
		
		ListaEncadeada listaFunc = new ListaEncadeada();
		
		listaFunc.inserirCrescente("Carlos Guilherme Coelho", 1399);
		listaFunc.inserirCrescente("Gianluca Matos Klaumann", 500);
		listaFunc.inserirCrescente("Erick", 1400);
		listaFunc.inserirCrescente("Pedro Henrique Damann", 700);
		listaFunc.inserirCrescente("Leonardo Knopf", 900);
		listaFunc.inserirCrescente("Matheus Henrique Albino Schmidt", 1400);
		listaFunc.inserirCrescente("Felipe Cauê Machado", 1200);
		listaFunc.inserirCrescente("Bruno Adam", 1200);
		
		listaFunc.mostraLista();
		
		listaFunc.verificaDados(1400);
		
	}
}