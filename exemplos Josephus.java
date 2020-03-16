import java.util.*;

public class Josephus {

	public static void main(String[] args) {
	    List<Integer> r;
	    System.out.println(r = josephus(5, 3, 1));                     
	    System.out.printf("Person %d is last\n", r.get(r.size() - 1));  
	}

	// remove N elements in equal steps starting at specific point
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
