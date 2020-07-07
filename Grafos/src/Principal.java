public class Principal {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Digite o número de vértices do Grafo: ");
		//Grafo grafo	= new Grafo(scanner.nextInt());

		Grafo 	g1 = new Grafo("Grafo 1");
		Vertice v1 = new Vertice("Vertice 1");
		Vertice v2 = new Vertice("Vertice 2");
		Aresta 	a1 = new Aresta("Aresta", v1, v2, 1);
		g1.adicionarVertice(v1);
		g1.adicionarVertice(v2);
		g1.adicionarAresta(a1);
		
		

	}

}
