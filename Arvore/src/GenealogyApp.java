import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GenealogyApp {

	public static void main(String[] args) {
		GeneralTree arvore = readTree("C:\\Users\\CVS - 12\\eclipse-workspace\\Arvore\\src\\Texto.txt");

		System.out.println("\n3. Número de descendentes de Mauro Paulo S01: " + arvore.contarDescendentes("Mauro Paulo S01"));
		System.out.println("\n---");

		System.out.println("\n4. Listar Filhos de Mauro Paulo S01: " + arvore.listarFilhos("Mauro Paulo S01"));
		System.out.println("\n---");

		 System.out.println("\n5. Netos de Edmundo Antonio S01");
		 System.out.println("\n---");
		 
		 System.out.println("\n6. Listar Tios de Mauro Paulo S01: " +  arvore.tios("Mauro Paulo S01"));
		 System.out.println("\n---");
		   
		 System.out.println("\n7. Primos de Julia S01 A02" + arvore.primos("Julia S01 A02"));
		 
		 

	}

	private static GeneralTree readTree(String arq) {

		GeneralTree arv = null;
		try {

			FileReader arquivo = new FileReader(arq);
		    BufferedReader buff = new BufferedReader(arquivo);
			//BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(arq), "UTF-8"));

			String line;
			try {

				line = buff.readLine();
				line = line.trim();
				arv = new GeneralTree(line);
				line = buff.readLine();
				
				while (line != null) {
					line = line.trim();
					String[] pessoas = line.split(" \\| ");
					for (int i = 1; i < pessoas.length; i++) {
						arv.inserir(pessoas[i], pessoas[0]);
					}
					line = buff.readLine();

				}
			} finally {
				buff.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arv;
	}
}