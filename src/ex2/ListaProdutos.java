package ex2;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutos {

	private Produto inicio;
	private Produto fim;
	
	public ListaProdutos() {
		inicio = null;
	}
	
	public Produto getInicio() {
		return inicio;
	}
	
	public void aplicarTaxa(int taxa) {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return;
		}
		Produto aux = inicio;
		List<Integer> quantsMaior = new ArrayList<>();
		System.out.println("Relatório: \n");
		do {
			System.out.println("Código: " + aux.getCodigo());
			aux.setPreco(aux.getPreco() - (aux.getPreco() * taxa * 0.01));
			System.out.println("Novo preço: " + aux.getPreco() + "\n");
			if(aux.getQuantEstoque() > 100)
				quantsMaior.add(aux.getQuantEstoque());
			aux = aux.getProx();
		} while(aux != inicio);
		System.out.println("Quantidade no estoque dos produtos com quantidade maior que 100: " + quantsMaior);
	}
	
	public void inserirInicio(String codigo, double preco, int quantEstoque) {
		Produto novoNodo = new Produto(codigo, preco, quantEstoque);
		if(inicio == null) { // Caso a lista esteja vazia
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		} else { // Caso a lista não esteja vazia
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			fim.setProx(inicio);
		}
	}
	
	public void mostrarLista() {
		if(inicio == null) {
			System.out.println("Lista Vazia");
			return;
		}
		Produto aux = inicio;
		do {
			System.out.println("Código: " + aux.getCodigo());
			System.out.println("Preço: " + aux.getPreco());
			System.out.println("Quantidade estocada: " + aux.getQuantEstoque() + "\n");
			aux = aux.getProx();
		} while(aux != inicio);
		System.out.println();
	}
	
}