import java.util.Stack;

public class pilha03 {

	public static void main(String[] args) {
		
		Stack<String> nossaPilha = new Stack<String>();
		
		nossaPilha.push("A");
		nossaPilha.push("B");
		nossaPilha.push("C");
		nossaPilha.push("D");
		nossaPilha.push("E");
		nossaPilha.push("F");
		
		nossaPilha.pop();
		nossaPilha.pop();

		// EXIBINDO INFORMAÇÕES SOBRE A PILHA 
		if (nossaPilha.isEmpty()) {
			System.out.println("A PILHA ESTÁ VAZIA!");
		} else {
			System.out.println("NOSSA PILHA...\n\nElemento\tÍndice\n----------------------");
			for (int i = nossaPilha.size() - 1; i > -1; i--) {
				System.out.println(nossaPilha.get(i) + "\t\t" + i);
			}
			System.out.println("\nNÚMERO DE ELEMENTOS: " + nossaPilha.size());
			System.out.println("ELEMENTO NO TOPO: " + nossaPilha.peek() + " na posição " + nossaPilha.indexOf(nossaPilha.peek()));
		
	  }

	}
}
