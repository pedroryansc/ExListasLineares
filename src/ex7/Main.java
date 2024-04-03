package ex7;

public class Main {
	public static void main(String[] args) {
		
		FilaPrioridade fila = new FilaPrioridade();
		
		fila.inserir("Pedro Ryan Coelho Iplinski", 3);
		fila.inserir("Gianluca Matos Klaumann", 6);
		fila.inserir("Igor Kammer Grahl", 5);
		fila.inserir("Pedro Henrique Damann", 4);
		fila.inserir("Leonardo Knopf", 2);
		
		fila.mostrarFila();
		System.out.println(fila.getTamanho());
		
		fila.remover();
		fila.remover();
		fila.remover();
		fila.remover();
		fila.remover();
		fila.remover();
		
	}
}