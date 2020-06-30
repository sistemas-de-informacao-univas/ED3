package lista;

public class Lista {
	
	private int pri_ocup;
	private int ult_ocup;
	private int pri_livre;
	private int lista_dados[];
	private int array_prox[];
	private int qtde_itens;
	
	public Lista(int tam){
		
		lista_dados = new int[tam];
		
		//declaração array proximo
		array_prox = new int[tam];
		//preenche o array
		for(int i = 0; i< tam; i++) array_prox[i] = i+1; 
		 //define o ultimo como -1 pra sinalizar fim array
		array_prox[tam -1] = -1;
		
		pri_ocup = -1;
		ult_ocup = -1;
		pri_livre = 0;
		qtde_itens = 0;
		
	}
	
	
	
	public boolean listaCheia(){
		/*
		*  verifica se o item na posição do pri_livre no array_prox é -1,
		*  se for, ele e o ultimo item, e a lista esta cheia
		*/
		return qtde_itens == lista_dados.length;
	}
	
	
	
	public boolean listaVazia(){
		/*
		 *  verifica se o primeiro ocupado(pri_ocup) é igual a -1,
		 *  se for, a lista esta vazia
		 */
		return pri_ocup == -1;
		
	}
	
	
	
	public void inserirNoFinal(int valor) throws Exception{
		
		//verifica se a lista esta cheia
		if(listaCheia()) throw new Exception("Lista Cheia");
		
		
		if(listaVazia()) pri_ocup = pri_livre;
		ult_ocup = pri_livre;
		
		//insere o valor na lista
		lista_dados[pri_livre] = valor;
		//altera o valor do pri_livre para o proximo livre;
		pri_livre = array_prox[pri_livre];
		
		qtde_itens++;
		

	}//inserirNoFinal
	
	
	
	public void inserirNoInicio(int valor) throws Exception{
		
		//verifica se a lista esta cheia
		if(listaCheia()) throw new Exception("Lista Cheia");
		
		//passa o pri_ocup pra uma variavel temporaria
		int temp_pri_ocup = pri_ocup;
		//altera o primeiro ocupado para a pos do item que esta sendo inserido
		pri_ocup = array_prox[ult_ocup];
		//altera o proximo item do ult_ocup para o do primeiro livre
		array_prox[ult_ocup] = array_prox[pri_livre];
		//aponta o atual primeiro item da lista para o antigo primeiro atual segundo item
		array_prox[pri_livre] = temp_pri_ocup;
		
		
		//insere o valor na lista
		lista_dados[pri_livre] = valor;
		//altera o valor do pri_livre para o proximo livre;
		pri_livre = array_prox[pri_livre];
		
		qtde_itens++;
		
	}//inserirNoInicio
	
	
	
	public void inserirNaPosicao(int posicao, int valor) throws Exception{
		
		//verifica se a lista esta cheia
		if(listaCheia()) throw new Exception("Lista Cheia");
		//verifica se a posição esta dentro dos parâmetros para inserir valor no meio
		if(posicao-1 < 0 || posicao >= lista_dados.length) 
			throw new Exception("Posição fora dos parâmetros da lista");
		
		
		//variável temporaria para o proximo item da lista
		int pos_proximo_item_array = pri_ocup;
		
		//tratamento especial para o primeiro e o ultimo item da lista
		if (posicao == 0){
			
			inserirNoInicio(valor);
			
		}else if(posicao == lista_dados.length-1 || posicao >= qtde_itens){
			inserirNoFinal(valor);
			
		}else{
		  //percorre a lista de posições
		  for(int i = 1; i <= array_prox.length; i++){
			
			if(i == posicao){
				//variável temporaria para posicao -1
				int temp_pos_item_anterior = array_prox[pos_proximo_item_array];
			
				array_prox[pos_proximo_item_array] = pri_livre;
				array_prox[ult_ocup] = array_prox[pri_livre];
				array_prox[pri_livre] = temp_pos_item_anterior;
				
				//insere o valor na lista
				lista_dados[pri_livre] = valor;
				
				//altera o valor do pri_livre para o proximo livre;
				pri_livre = array_prox[pri_livre];
				
				qtde_itens++;
						
			}else{
				pos_proximo_item_array = array_prox[pos_proximo_item_array];
			}
			
		  }//for
		  
		}
		
	}//inserirNaPosicao
	
	
	
	public void inserirAntes(int valorBase, int valorInserido) throws Exception{
		
		if(listaCheia())throw new Exception("Lista Cheia");
		

		int pos_lista = pri_ocup;
		int pos_ant_lista = pri_ocup;

		
		for(int i = 0; i< qtde_itens; i++){
			if(lista_dados[pos_lista] == valorBase){
				
				if(i == 0){
					inserirNoInicio(valorInserido);
					break;
				
				}else{
					int temp_pri_livre = array_prox[pri_livre];
					
					lista_dados[pri_livre] = valorInserido;

					array_prox[pri_livre] = array_prox[pos_ant_lista];
					array_prox[pos_ant_lista] = array_prox[ult_ocup];
					array_prox[ult_ocup] = temp_pri_livre;
					
					pri_livre= array_prox[pri_livre];
					qtde_itens++;
					break;
					
				}
			
			}else{
				
				pos_ant_lista = pos_lista;
				pos_lista = array_prox[pos_lista];
			}
		}
		
		
	}//inserirAntes
	
	
	
	public void inserirDepois(int valorBase, int valorInserido) throws Exception{
		
		if(listaCheia())throw new Exception("Lista Cheia");
		

		int pos_lista = pri_ocup;

		
		for(int i = 0; i< qtde_itens; i++){
			if(lista_dados[pos_lista] == valorBase){
				
				if(i == qtde_itens - 1){
					inserirNoFinal(valorInserido);
					break;
				
				}else{
					int temp_pri_livre = array_prox[pri_livre];
					
					lista_dados[pri_livre] = valorInserido;

					array_prox[pri_livre] = array_prox[pos_lista];
					array_prox[pos_lista] = array_prox[ult_ocup];
					array_prox[ult_ocup] = temp_pri_livre;
					
					pri_livre= array_prox[pri_livre];
					qtde_itens++;
					break;
					
				}
			
			}else{
				
				pos_lista = array_prox[pos_lista];
			}
		}
		
	}//inserirDepois
	
	
	
	
	public void removerPrimeiro() throws Exception{
		
		if(listaVazia()) throw new Exception("Lista Vazia");
		
		int temp_pri_livre = pri_livre;
		
		pri_livre = pri_ocup;
		
		pri_ocup = array_prox[pri_ocup];
		
		array_prox[pri_livre] = temp_pri_livre;
		
		array_prox[ult_ocup] = pri_livre;
		
		qtde_itens--;

		
	}//removerPrimeiro
	
	
	
	
	public void removerUltimo() throws Exception{
		
		if(listaVazia()) throw new Exception("Lista Vazia");
		
		pri_livre = ult_ocup;
		
		for(int i = 0; i < array_prox.length; i++){
			if(array_prox[i] == ult_ocup){
				
				ult_ocup = i;
				qtde_itens--;
				
			}
		}
		
	}//removerUltimo
	
	
	
	
	public void removerItem(int valor) throws Exception{
		
		if(listaVazia()) throw new Exception("Lista Vazia");

		int pos_lista = pri_ocup;
		int pos_ant_lista = pri_ocup;

		
		for(int i = 0; i< qtde_itens; i++){
			if(lista_dados[pos_lista] == valor){
				
				if(i == 0){
					removerPrimeiro();
				
				}else if(i == qtde_itens -1){
					removerUltimo();
				
				}else{					
					
					array_prox[ult_ocup] = array_prox[pos_ant_lista]; 
					array_prox[pos_ant_lista] = array_prox[pos_lista];
					array_prox[pos_lista] = pri_livre;
					pri_livre = pos_lista;
					qtde_itens--;
					break;
					
				}
			
			}else{
				
				pos_ant_lista = pos_lista;
				pos_lista = array_prox[pos_lista];
			}
		}
		
	}//removerItem
	
	
	
	
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
	}//buscar
	
	
	
	
	public void imprimeLista(){
		
		System.out.println("Primeiro Ocupado: " + pri_ocup);
		System.out.println("Último Ocupado: " + ult_ocup);
		System.out.println("Primeiro Livre: " + pri_livre);
		
		String dados_lista = "[";

		int posicaoLista = pri_ocup;
		
		for(int i = 0; i< qtde_itens; i++){
			
			dados_lista+= lista_dados[posicaoLista] + ", ";
			posicaoLista = array_prox[posicaoLista];
			
		}
		
		dados_lista += "]";
		
		System.out.println("Lista de Dados: \n"+ dados_lista);
		
		
		String array_pos = "[";
		
		for(int i : array_prox){
			array_pos += i + ", ";
		}
		
		array_pos += "]";  

		System.out.println("Array Pŕoximo: \n"+ array_pos);
			
		
	}
}//


