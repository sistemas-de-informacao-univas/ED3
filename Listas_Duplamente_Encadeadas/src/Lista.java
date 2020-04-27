package dupla;

public class Lista {
	//atributos da classe
	private No inicio;
	private No fim;
	
	//construtor
	public Lista()
	{
		inicio=null;
		fim=null;
	}
	
	// metodos da classe
	
	// inserir o elemento em um novo Nó
	public void insere(int elemento){
		No caixa = new No(inicio,null,elemento);
		if (inicio==null)//se lista estiver vazia
			inicio = fim = caixa;
		else{
			fim.setProximo(caixa);
			fim = caixa;
		}
	}
	
	public void exibeLista()
	{
		No aux;
		aux=inicio;
		if (inicio == null) {
            System.out.println("Nada a exibir - a lista está vazia!");
        } else {
			while (aux!=null)
			{
				System.out.print(aux.getElemento() + " ");
				aux=aux.getProximo();
			}
        }
		System.out.println();
	}
	
	public No Busca(int elemento)
	{
		No aux=inicio;
		while ((aux!=null) && (aux.getElemento()!=elemento))
		{
			aux=aux.getProximo();
		}
		if ((aux!=null) && (aux.getElemento()==elemento)) {
			System.out.println("Elemento encontrado: " + elemento);
			return aux;
		}
		else 
			return null;
	}
	
	// remover
	public void remove(int elemento)
	{
		No aux;
		aux=Busca(elemento);
		if (aux!=null){ // se existe o No a ser deletado
			if (inicio!=fim) { // se só existe um Nó na lista
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
			}else{
				inicio=null;
				fim=null;
			}
		}else {
			System.out.println("Elemento nao encontrado");
		}
	}
	
	public void inverter() {
		
	}
	
}
