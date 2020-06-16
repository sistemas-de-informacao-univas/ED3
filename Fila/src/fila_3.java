public class fila_3 {
	
	private int [] v;
    private int primeiro;
    private int ultimo;
    
    
    // ---------------------------- Construtor
    
    public fila_3(int numElementos) {
        v = new int[numElementos];
        primeiro = 0;
        ultimo = -1;
    }

   
    // ---------------------------- insereFila
    
    public void insereFila(int elemento) {
        int m = v.length;
        
        if (ultimo < m-1) {
           ultimo++;
           v[ultimo] = elemento;
        } else {
            System.out.println("Status: Fila Cheia");
        }
    }
    
    // ---------------------------- alteraValor
    
    public void alteraFila(int elemento, int posicao) {
        int m = v.length;
        
        if (posicao < m-1) {
           v[posicao] = elemento;
        } else {
            System.out.println("Status: Fora da Fila");
        }
    }
    
    // ---------------------------- removeFila
    
    public int removeFila() {
        int elemento;
        
        if (ultimo != -1) {
            elemento = v[primeiro];
            primeiro++;
            if (primeiro > ultimo) {
                primeiro = 0;
                ultimo = -1;
            }
            return(elemento);
        } else {
            System.out.println("Status: Fila Vazia");
            return(-1);
        }
    }

    // ---------------------------- consultaFila
    
    public int consultaFila() {
        int elemento;
        
        if (ultimo != -1) {
            elemento = v[primeiro];
            return(elemento);
        } else {
            System.out.println("Status: Fila Vazia");
            return(-1);
        }
    }

    // ---------------------------- exibeFila
    
    public void exibeFila() {
        System.out.print("Fila: ");
        for (int i = primeiro;i <= ultimo;i++) {
            System.out.print(v[i] + " ");
        }
        if (ultimo == -1) {
            System.out.print("Vazia");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
            fila_3 fila = new fila_3(5);

            fila.insereFila(3);
            fila.insereFila(4);
            fila.insereFila(5);
            fila.exibeFila();
            fila.removeFila(); 
            fila.alteraFila(6, 2);
            fila.exibeFila();

    }
}
	


