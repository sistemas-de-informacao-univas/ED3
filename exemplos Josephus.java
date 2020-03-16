import java.util.*;

public class josephus {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		
		 int n,x,i,m;
		 x=0;
		 System.out.println("\n\n   SOLUCAO DO PROBLEMA DE JOSEPHUS \n\n");
		 System.out.println("Entre com o numero de pessoas (n): ");
		 n = entrada.nextInt();
		    
		 System.out.println("Entre com o valor do \"passo\" (m): ");
		 m = entrada.nextInt();
		 
		 System.out.println("\n A sequencia de eliminação é:\n");
		 for (i=1;i<=n;i++){
		    x=m*i; // se n fosse infinito seria a i-esima pessoa a ser morta
		    while (x>n)  // ajusta x enquanto x > n
		      	x=(m*(x-n)-1)/(m-1); // arredonda para baixo!
			if(i==n){
			   System.out.println("\n\nPessoa Selecionada: " + x);
			}else{
			   System.out.println("Pessoa Eliminada: " + x);
			}
		 }
	}
}
