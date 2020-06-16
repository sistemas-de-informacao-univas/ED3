
public class fila_1 {

	public static void main(String[] args) {
		System.out.println("-------------------Arrays-------------------");
		 //inicializando array com 3 posiçġes
		 String[] array = new String[3];

		 //inserindo elementos
		 array[0] = "A";
		 array[1] = "B";
		 array[2] = "C";

		 //percorrendo o array para fazer a listagem dos dados
		 for (int i = 0; i < array.length; i++){
		     System.out.println(array[i]);
		 }
		 
		 array[0] = " ";
		 
		 for (int i = 0; i < array.length - 1; i++){
			 array[i] = array[i+1];
		 }
		 array[array.length-1] = " ";
		 
		 for (int i = 0; i < array.length; i++){
		     System.out.println(array[i]);
		 }

	}

}
