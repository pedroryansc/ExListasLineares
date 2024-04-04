package ex9;

import java.util.ArrayList;
import java.util.List;

public class ListaEncadeada {

	private Funcionario inicio;
	
	public ListaEncadeada() {
		inicio = null;
	}
	
	public Funcionario getInicio() {
		return inicio;
	}
	
	public void inserirCrescente(String nome, float salario) {
		Funcionario novoFunc = new Funcionario(nome, salario);
		if(inicio == null)
			inicio = novoFunc;
		else {
			Funcionario aux = inicio;
			Funcionario auxAnterior = null;
			while(aux != null) {
				if(aux == inicio.getProx())
					auxAnterior = inicio;
				
				if(novoFunc.getSalario() < aux.getSalario()) {
					if(aux == inicio) {
						novoFunc.setProx(aux);
						inicio = novoFunc;
						return;
					} else {
						novoFunc.setProx(aux);
						auxAnterior.setProx(novoFunc);
						return;
					}
				} else {
					if(aux.getProx() == null) {
						aux.setProx(novoFunc);
						return;
					}
				}
				aux = aux.getProx();
				if(auxAnterior != null)
					auxAnterior = auxAnterior.getProx();
			}
		}
	}
	
	public void verificaDados(float salParametro) {
		Funcionario aux = inicio;
		
		// Conta o total de funcionários na lista
		
		int contTotal = 0;
		while(aux != null) {
			contTotal++;
			aux = aux.getProx();
		}
		
		List<String> funcionario = new ArrayList<>();
		float soma = 0;
		int contMaior = 0;
		
		aux = inicio;
		
		while(aux != null) {
			
			// Soma o total dos salários dos funcionários
			
			soma += aux.getSalario();
			
			// Verifica o(s) funcionário(s) com maior salário
			
			Funcionario aux2 = inicio;
			int contVezes = 0;
			while(aux2 != null) {
				if(aux.getSalario() >= aux2.getSalario())
					contVezes++;
				aux2 = aux2.getProx();
			}
			if(contVezes == contTotal)
				funcionario.add(aux.getNome());
			
			// Verifica a quantidade de funcionários com salário superior ao valor passado como parâmetro 
			
			if(aux.getSalario() > salParametro)
				contMaior++;
			
			aux = aux.getProx();
		}
		
		// Calcula a média dos salários
		
		float media = soma / contTotal;
		
		System.out.println("Funcionário(s) com maior salário: " + funcionario);
		System.out.println("Média salarial de todos os funcionários: R$ " + media);
		if(contMaior > 0)
			System.out.println("Quantidade de funcionários com salário superior a R$ " + salParametro + ": " + contMaior + " Funcionários");
		else
			System.out.println("Nenhum funcionário tem um salário superior a R$ " + salParametro);
	}
	
	public void mostraLista() {
		if(inicio == null) {
			System.out.println("Lista Vazia");
			return;
		}
		Funcionario aux = inicio;
		while(aux != null) {
			System.out.println(aux.getNome() + " - Salário: " + aux.getSalario());
			aux = aux.getProx();
		}
		System.out.println();
	}
	
}