import java.util.ArrayList;

public class Grafo {
	protected String grafoNome;
	
	static ArrayList<Vertice> listaVertice = new ArrayList<Vertice>();
	static ArrayList<Aresta> listaAresta = new ArrayList<Aresta>();
	
	protected Grafo(String grafoNome) {
		this.grafoNome = grafoNome;
	}
	protected void adicionarVertice(Vertice v){		
		listaVertice.add(v);
	}
	protected void adicionarAresta(Aresta a){
		listaAresta.add(a);
	}
	protected void removerAresta(Aresta a){
		//implementar codigo
	}
	protected void testaAresta(Aresta a1, Aresta a2) {
		//implementar codigo		
	}
	protected void obterVerticesAdjacentes(Vertice v){
		//implementar codigo
	}
	protected int obterVerticeGrau(Vertice v){
		int grauVertice = 0;
		if(listaVertice.contains(v)== true){
			for(Aresta a : listaAresta){
				if((a.arestaDestino.equals(v))||(a.arestaOrigem.equals(v))){
					grauVertice++;					
				}
			}
			return grauVertice;
		}
		else{
			System.out.println("Vertice não pertence ao grafo \n");
			return -1;
		}
	}
	protected void obterVerticeGrauMMM(){
		//implementar codigo
		// deve ser um for dentro de um for,
		//pesquisando cada elemento da lista de vertices
		//depois vendo a quantidade de arestas ligadas a ele
	}
	protected void testarConexo(){
		//implementar
	}
	
	
	
	
	
	
	
	
	
	
}
