import java.util.Scanner;

public class fila_exerc2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		 //instanciar um objeto para controle da fila (classe Fila)

	
		do {
			System.out.println("------- Menu -------");
			System.out.println("1 - Exibir quantidade de carros na fila");
			System.out.println("2 - Exibir tempo de espera atual");
			System.out.println("3 - Inserir um carro na fila");
			System.out.println("4 - Remover um carro da fila");
			System.out.println("5 - Exibir media de espera de todo o dia");	
			System.out.println("0 - Sair");
			int aux1;
			x = sc.nextInt();
			
			if (x == 1) {
				System.out.println("Ha XX carros na fila.");
			}
			
			if (x == 2) {
				System.out.println("O tempo de espera atual e de: XX minutos");
				
			}
			
			if (x == 3) {
				System.out.println("Digite os 4 numeros da placa do proximo veiculo: ");
				aux1=sc.nextInt();
			}
			
			if (x == 4) {
				System.out.println("Veiculo removido !!!");
			}
			
			if (x == 5) {
				
				System.out.println("A media de espera durante o dia e de XX minutos");
			}
			
			if (x >= 6 || x < 0) {
				System.out.println("Opção Invalida!");
			}
			if (x == 0) {
				System.out.println("Programa encerrado!");
				break;
			}
		}
		while(x != 0);
		sc.close();
	}
}