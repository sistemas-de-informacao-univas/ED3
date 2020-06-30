package dupla;

public class Principal {

	public static void main(String[] args) {
		
		Lista valor = new Lista();
	
		valor.insere(10);
		valor.insere(20);
		valor.insere(30);
		valor.insere(40);
		valor.insere(50);
		valor.insere(60);
		valor.exibeLista();
		
		valor.remove(60);
		valor.exibeLista();

	}

}
