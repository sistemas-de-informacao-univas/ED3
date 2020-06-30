package lista;

public class main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
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
