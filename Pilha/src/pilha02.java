import java.util.ArrayList;

public class pilha02 {
		
	public static void main(String[] args) {
		
		ArrayList<String> pilha = new ArrayList<String>();
		
		pilha.add("A");
		pilha.add("B");
		pilha.add("C");
		pilha.add("D");
		pilha.add("E");
		
		System.out.println(pilha);
		System.out.println(pilha.size());
		
		pilha.remove(pilha.size()-1);
		pilha.remove(pilha.size()-1);
		pilha.remove(pilha.size()-1);
		
		System.out.println(pilha);
		
		pilha.remove(pilha.size()-1);
		
		System.out.println(pilha);
		
	}
}
