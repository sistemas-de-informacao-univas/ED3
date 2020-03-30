package teste;

public class Lista {
	
	private No inicio;
	
	public Lista() {
		this.inicio = null;
	}
	
	public void inserir(int elemento) {
		No novo = new No();
		novo.setElemento(elemento);
		novo.setProximo(null);
		
		if(inicio == null) {
			inicio = novo;
		}
		else {
			No aux;
			aux = inicio;
			while(aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}
	
	public void listar() {
		if(inicio == null) {
			System.out.println("Não há elementos na lista");
		}
		else {
			No aux = inicio;
			while(aux.getProximo() != null) {
				System.out.println("Elemento: " + aux.getElemento());
				aux = aux.getProximo();
			}
			System.out.println("Elemento: " + aux.getElemento());
		}
	}

}
