package ex8;

public class Main {
	public static void main(String[] args) {
		
		Fila f = new Fila();
		
		f.inserir(2);
		f.inserir(7);
		f.inserir(11);
		f.inserir(6);
		f.inserir(9);
		f.inserir(10);
		
		Fila f_impares = new Fila();
		Fila f_pares = new Fila();
		
		Fila.separaValores(f, f_impares, f_pares);
		
	}
}