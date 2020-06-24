
public class Lista {

	private No inicio;
	
	public Lista() {
		this.inicio = null;
	}
	
	public void inserir(int elemento) {
		No novo = new No();
		novo.setElemento(elemento);
		novo.setProximo(null);
		
		if (inicio == null) {
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
	
	public boolean vazio() {
		return this.inicio == null;
	}
	
	public void remove(int elemento)
	{
		No aux;
		aux=Busca(elemento);
		if (aux!=null){ // se existe o No a ser deletado
			
				if (aux==inicio)// se o Nó esta no começo
				{
					inicio=aux.getProximo();
					aux.getProximo().setAnterior(null);
					System.out.println("Removendo do inicio: " + elemento);
				}else {
					if (aux==fim)// se o Nó esta no fim
					{
						fim=aux.getAnterior();
						aux.getAnterior().setProximo(null);
						System.out.println("Removendo do fim: " + elemento);
					}else{ // se o no esta no meio
						aux.getAnterior().setProximo(aux.getProximo());
						aux.getProximo().setAnterior(aux.getAnterior());
						System.out.println("Removendo do meio: " + elemento);
					}
				}
				aux.setAnterior(null);
				aux.setProximo(null);
				System.out.println("Elemento removido: " + elemento);
			
		}else {
			System.out.println("Elemento nao encontrado");
		}
	}
	
	
	
	
	public boolean buscar(int valor) throws Exception{
		
		
		int posicaoLista = pri_ocup;
		
		for(int i = 0; i< qtde_itens; i++){
			if(lista_dados[posicaoLista] == valor){
				return true;
			
			}else{
				posicaoLista = array_prox[posicaoLista];
			}
		}
		return false;
	}
	
	
	
	
}
