package dupla;

public class No {
	private No anterior;
	private No proximo;
	private int elemento;
	
	//construtor
	public No(No anterior, No proximo, int elemento)
	{
		this.anterior=anterior;
		this.proximo=proximo;
		this.elemento=elemento;
	}

	//getter e setter
	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

}
