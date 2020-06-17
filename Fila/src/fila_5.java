import java.util.LinkedList;
import java.util.Queue;
	
public class fila_5 {

    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>();

        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll="+queue.poll()); 
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element());  
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); 
        for(String q : queue){
            System.out.println(q);
        }
    }
	
}
