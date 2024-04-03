package ex7;

public class FilaPrioridade {

	private Paciente inicio;
	private Paciente fim;
	private int tamanho = 0;
	
	public int getTamanho() {
		return tamanho;
	}
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	public void inserir(String nome, int prioridade) {
		Paciente novoNodo = new Paciente(nome, prioridade);
		if(estaVazia()) {
			inicio = novoNodo;
			fim = novoNodo;
			tamanho++;
		} else {
			tamanho++;
			Paciente aux = inicio;
			Paciente auxAnterior = null;
			while(aux != null) {
				if(aux == inicio.getProx())
					auxAnterior = inicio;
				
				if(novoNodo.getPrioridade() > aux.getPrioridade()) {
					if(inicio == fim) {
						inicio = novoNodo;
						inicio.setProx(fim);
						return;
					} else {
						if(aux == inicio) {
							novoNodo.setProx(aux);
							inicio = novoNodo;
							return;
						} else {
							novoNodo.setProx(aux);
							auxAnterior.setProx(novoNodo);
							return;
						}
					}
				} else {
					if(aux == fim) {
						fim.setProx(novoNodo);
						fim = novoNodo;
						return;
					}
				}
				aux = aux.getProx();
				if(auxAnterior != null)
					auxAnterior = auxAnterior.getProx();
			}
		}
	}
	
	public void remover() {
		if(estaVazia()) {
			System.out.println("A fila está vazia");
			return;
		}
		System.out.println("Paciente atendido - " + inicio.getNome() + " (Prioridade " + inicio.getPrioridade() + ")");
		inicio = inicio.getProx();
		tamanho--;
		if(estaVazia())
			fim = null;
	}
	
	public void mostrarFila() {
		if(estaVazia()) {
			System.out.println("A fila está vazia");
			return;
		}
		Paciente aux = inicio;
		while(aux != null) {
			System.out.println(aux.getNome() + " - Prioridade " + aux.getPrioridade());
			aux = aux.getProx();
		}
	}
	
}