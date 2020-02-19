import java.util.ArrayList;

public class exemplo_lista_linear{

  public static void main(String[] args){
  
    ArrayList lista = new ArrayList();
    
    lista.add("Primeiro");
    lista.add("Segundo");
    lista.add(3);
    lista.add(4);
    
    System.out.println(lista.size + "  " + lista);
    
    lista.remove(2); 
    
    System.out.println(lista.size() + "  " + lista);
    
    System.out.println(lista.get(1));
    
    lista.set(0,1);
    
    System.out.println(lista.size + "  " + lista);
    
  }

}
