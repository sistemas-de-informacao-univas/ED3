import java.util.*;

public class pilha01 {

	public static double vetor[] = new double[15];
	public static int Topo = 0;
	public static void main(String args[]){
		int op = 0;
		
		while(op != 5){
			op = menu();
			switch(op){
				case 1:empilhar();break;
				case 2:desempilhar();break;
				case 3:mostarTopo();break;
				case 4:mostrarPilha();break;
				case 5:sair();break;
				default:System.out.println("Valor digitador errado !!!");
			}
		}
	}
	
	public static int menu(){
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int k =0;
		System.out.println("....................................");
		System.out.println(".  M E N U    D O   S I S T E M A  .");
		System.out.println(".                                  .");
		System.out.println(". 1. Empilhar                      .");
		System.out.println(". 2. Desempilhar                   .");   
		System.out.println(". 3. Mostrar topo                  .");
		System.out.println(". 4. Mostrar pilha                 .");
		System.out.println(". 5. Sair do sistema               .");
		System.out.println(".                                  .");
		System.out.println("....................................");
        System.out.print("Opcao : ");
        k = entrada.nextInt();
        System.out.println("....................................");
        return k;
    }
    
    public static int vazia(){
    	Topo=contavetor();
    	if(Topo == 0)
    	 return 0;
    	else
    	 return 1;
    }
   
   public static int cheia(){
   		Topo=contavetor();
   		if(Topo >= 10)
   		 return 0;
   		else
   		 return 1;
   	}
   	
  	public static int contavetor(){
     int     tamanho;
     double  valor;
     tamanho = 0;
     valor   = 0;
  	 for(int contador = 1;contador <= 10;contador++){
	    valor = vetor[contador];
	    if(valor != 0)
	     tamanho++;
	 }       
     return tamanho;	
   }
   
   public static void empilhar(){
	   @SuppressWarnings("resource")
	Scanner entrada = new Scanner(System.in);
	if(cheia() != 0){
	   Topo++;
	   System.out.print("");
	   System.out.println(".....................................");
	   System.out.println(" Numero do elemento da pilha "+Topo);
	   System.out.println(" Entre com um valor para empilhar-mos");
	   vetor[Topo]=entrada.nextInt();
	   System.out.println(".....................................");
	}
	else{
	   System.out.println("......................................................");
	   System.out.println(" A pilha ja esta cheia, nao pode receber mais valores ");
	   System.out.println("......................................................");
	   pausa();
	}

  }

  public static void pausa(){
	@SuppressWarnings("resource")
	Scanner entrada = new Scanner(System.in);
  	int p = 0;
  	System.out.println("Aperte qualquer tecla para continuar");
  	p = entrada.nextInt();
  }

  public static void desempilhar(){
  	if(vazia() != 0){
  		vetor[Topo]=0;
  		Topo--;
  	
  		System.out.println("Elemento "+(Topo + 1)+" desempilhado");
    }
    else{
    	System.out.println("A pilha esta vazia, nao ha elementos para desempilhar !!!");
    }
  	pausa();
  }
  
  public static void mostarTopo(){
  	if(vazia() != 0)
  	 System.out.println("Elemento Topo = "+vetor[Topo]);
  	else
  	 System.out.println("A pilha esta vazia."); 
  }
  
  public static void mostrarPilha(){
  	if(vazia() != 0){
  		for(int i=Topo; i >= 1;i--)
  		 System.out.println("O elemento de numero "+ i +" contem o valor "+ vetor[i]);
  	}
  }
  
  public static void sair(){
  	System.out.println("Saindo do programa");
  	pausa();
  }
}

