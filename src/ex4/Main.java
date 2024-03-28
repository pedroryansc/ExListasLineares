package ex4;

public class Main {
	public static void main(String[] args) {
		
		ListaConjunto a = new ListaConjunto();
		
		a.inserirInicio(45);
		a.inserirInicio(3);
		a.inserirInicio(22);
		a.inserirInicio(123);
		
		a.mostraLista();
		
		ListaConjunto b = new ListaConjunto();
		
		b.inserirInicio(6);
		b.inserirInicio(5);
		b.inserirInicio(45);
		b.inserirInicio(3);
		
		b.mostraLista();
		
		System.out.println("\nUnião entre A e B: " + a.uniao(b));
		
	}
}