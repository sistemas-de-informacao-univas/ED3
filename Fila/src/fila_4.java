
public class fila_4 {
	
	private int lista[];
    private int inicio;
    private int fim;
    private boolean vazia;

    public fila_4() {
        this.lista = new int[20];
        this.inicio = 0;
        this.fim = 0;
        this.vazia = true;
    }

    public boolean isCheia() {
        return this.inicio == this.fim && !this.vazia;
    }

    public void adicionar(int valor) {
        if (isCheia()) {
            throw new IllegalStateException("Fila cheia");
        }
        this.lista[this.fim] = valor;
        this.fim = (this.fim + 1) % this.lista.length;
        this.vazia = false;
    }

    public int remover() {
        if (this.vazia) {
            throw new IllegalStateException("Fila vazia");
        }
        int valor = this.lista[inicio];
        this.inicio = (this.inicio + 1) % this.lista.length;
        this.vazia = this.inicio == this.fim;
        return valor;
    }

    public void mostrar() {
        int inicio = this.inicio;
        if (this.isCheia()) {
            System.out.println(this.lista[this.inicio]);
            inicio++;
        }
        for (int i = inicio; i != this.fim; i = (i + 1) % this.lista.length) {
            System.out.println(this.lista[i]);
        }
    }

    public int getTamanho() {
        System.out.println(this.inicio + ", " + this.fim);
        if (this.vazia)
            return 0;
        if (this.isCheia())
            return this.lista.length;
        if (this.fim > this.inicio)
            return this.fim - this.inicio;

        return this.fim + this.lista.length - this.inicio;
    }
    
    public static void main(String[] args) {
        
        fila_4 fila = new fila_4();

        fila.adicionar(4);
        fila.adicionar(5);
        fila.adicionar(6);
        fila.mostrar();
        fila.remover();               
        fila.mostrar();

    }
}
