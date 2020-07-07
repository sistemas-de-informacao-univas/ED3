//exige noo nimino 1 vertices
// na criacao da aresta ver se os vertices exstgem
public class Aresta {
	public 	String 	arestaNome;
	public 	int 	arestaPeso;
	public 	Vertice arestaOrigem;
	public 	Vertice	arestaDestino;
	
	public Aresta(String aNome, Vertice aOrigem, Vertice aDestino,int i){
		this.arestaNome = aNome;
		this.arestaOrigem = aOrigem;
		this.arestaDestino = aDestino;
		this.arestaPeso = i;
	}
	
}
