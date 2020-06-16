import java.util.ArrayList;
import java.util.List;

public class fila_2 {

	public static void main(String[] args) {
		System.out.println("-------------------ArrayList-------------------");

		   //criando um list, como List é interface, vamos utilizar a implementação ArrayList
	       List<String> lista = new ArrayList<String>();
	       
	       //inserindo elementos na lista
	       lista.add("A");
	       lista.add("B");
	       lista.add("C");
	       
	       //percorrendo a lista
	       System.out.println("Lista Atual");
	       for (String obj: lista){
	           System.out.println(obj);
	       }
	       System.out.println(lista);
	       
	       //inserindo um elemento numa determinada posição da lista
	       lista.add("D"); //Proibido no conceito da FILA
	       
	       //percorrendo a lista
	       System.out.println("Lista com novo elemento");
	       for (String obj: lista){
	           System.out.println(obj);
	       }
	       //substituindo o elemendo de uma determinada posição
	       lista.set(3, "E"); //Permitido no conceito da FILA
	       
	       //percorrendo a lista
	       System.out.println("Lista com elemento substituido");
	       for (String obj: lista){
	           System.out.println(obj);
	       }
	       
	       System.out.println(lista.size());
	       lista.remove(0);
	       System.out.println(lista);
	       System.out.println(lista.size());
	}

}
