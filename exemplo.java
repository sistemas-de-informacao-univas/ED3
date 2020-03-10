package estrutura_de_dados;
//https://codereview.stackexchange.com/questions/60934/josephus-problem-in-java

import java.util.*;

public class Jesuphus {

	public static void main(String[] argv) 
	{
		int i = 0;
	    List<String> r;
	    
	    Scanner entrada = new Scanner(System.in);
	    int elementos = entrada.nextInt();
	    
	    do {
	    	i++;
	    	String nome = entrada.next();
	    	r.add(nome);
	    } while(i<=elementos);
	    
	    System.out.println(r);
	    
	    //System.out.println(r = josephus(20, 8, 1));                     
	    //System.out.println("Ultimo soldado a ser removido: " + r.get(r.size() - 1));
	}

	static List<Integer> josephus(int N, int step, int start)
	{
	    if (N < 1 || step < 1 || start < 1) return null;

	    List<Integer> p = new LinkedList<Integer>();
	    for (int i = 0; i < N; i++)
	        p.add(i+1);

	    List<Integer> r = new LinkedList<Integer>();
	    int i = (start - 2) % N;
	    for (int j = N; j > 0; j--) {
	        i = (i + step) % N--;
	        r.add(p.remove(i--));
	    }

	    return r;
	}
}
