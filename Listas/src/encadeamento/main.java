package encadeamento;

public class main {

	public static void main(String[] args) throws Exception {

		Lista lista = new Lista(6);
		
		lista.inserirNoFinal(1);
		lista.inserirNoFinal(2);		
		lista.inserirNoFinal(3);
		lista.inserirNoFinal(4);
		lista.inserirNoFinal(5);
		
		lista.inserirAntes(1, 15);
		//lista.removerPrimeiro();
		//lista.inserirNaPosicao(3, 6);
		//lista.inserirNoInicio(3);
		//lista.inserirAntes(1,7);

		lista.imprimeLista();


	}

}
