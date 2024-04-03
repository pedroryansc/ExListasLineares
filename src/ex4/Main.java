package ex4;

public class Main {
	public static void main(String[] args) {
		
		Conjunto a = new Conjunto();
		
		a.inserirInicio(3);
		a.inserirInicio(22);
		a.inserirInicio(45);
		a.inserirInicio(123);
		
		a.mostraLista();
		
		Conjunto b = new Conjunto();
		
		b.inserirInicio(6);
		b.inserirInicio(5);
		b.inserirInicio(45);
		b.inserirInicio(3);
		b.inserirInicio(10);
		
		b.mostraLista();
		
		System.out.println("\nUnião entre A e B: " + a.uniao(b));
		
		System.out.println("Intersecção entre A e B: " + a.interseccao(b));
		
		System.out.println("Diferença entre A e B: " + a.diferenca(b));
		
	}
}