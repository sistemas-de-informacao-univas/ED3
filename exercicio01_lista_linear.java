import java.util.ArrayList;
import java.util.Scanner;

public class exercicio01_lista_linear {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		int opc = 1;

		ArrayList myList = new ArrayList();
		
		while(opc!=0) {
			int val = 1;
			int pos = 0;
			System.out.println("------------------------------------------------");
			System.out.println("Opçoes: 1-Inserir 2-Remover 3-Alterar 0-Encerrar");
			opc = entrada.nextInt();
			if(opc==1) {
				while(val!=0) {
					System.out.print("Valor: ");
					val = entrada.nextInt();
					if(val!=0) {
						myList.add(val);
						System.out.println("(" + myList.size() + ") " + myList);
					}
				}	
			}
			if(opc==2) {
				while(val!=0) {
					System.out.print("Posicao: ");
					val = entrada.nextInt();
					if(val!=0) {
						myList.remove(val);
						System.out.println("(" + myList.size() + ") " + myList);
					}
				}	
			}
			if(opc==3) {
				if(val==1) {
					while(val!=0) {
						System.out.print("Posiçao: ");
						val = entrada.nextInt();
						if(val!=0) {
							System.out.print("Valor: ");
							pos = entrada.nextInt();
							myList.set(val, pos);
							System.out.println("(" + myList.size() + ") " + myList);	
						}
	
					}	
				}
			}
		}
		System.out.println("FIM");
		
	}

}
