package ex10;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		ListaCircular l1 = new ListaCircular();

		for(int i = 1; i <= 100; i++) {
			l1.inserirInicio(random.nextInt(1001));
		}
		
		// l1.mostrarLista();
		System.out.println();
		
		ListaCircular l2 = new ListaCircular();
		l2.receberDados(l1);
		l2.mostrarLista();
		
	}
}