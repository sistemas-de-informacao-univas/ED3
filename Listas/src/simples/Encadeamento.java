package simples;

public class Encadeamento {

	public static void main(String[] args) {
		
		Lista valor = new Lista();
		
		valor.inserir(10);
		valor.inserir(15);
		valor.inserir(20);
		
		valor.listar();
		
		valor.remover();
	
		valor.listar();
	}

}
