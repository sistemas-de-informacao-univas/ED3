package lista;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		ArrayList myList = new ArrayList();
		
		Scanner entrada=new Scanner(System.in);
		System.out.print("Tamanho do array: ");
		int n = entrada.nextInt();
		int opc = -1;
		int local = -1;
		int val;

		while(opc!=0) {
			val = -1;
			int pos = 0;
			System.out.println("------------------------------------------------");
			System.out.println("Opçoes: 1-Inserir 2-Remover 0-Encerrar");
			opc = entrada.nextInt();
			if(opc==1) {
				while(val!=0) {
					System.out.print("Valor: ");
					val = entrada.nextInt();
					if(val!=0) {
						if(myList.size()<n) {
							local = myList.size();
							myList.add(val);
						}else {
							local++;
							if(local>=n) {local=0;}
							myList.set(local,val);
						}
					}
					System.out.println("(" + myList.size() + ", " + local + ") " + myList);
				}	
			}
			if(opc==2) {
				myList.remove(myList.size()-1);
				System.out.println("(" + myList.size() + ") " + myList);

			}
		}
	}
}
