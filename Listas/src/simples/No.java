package simples;

public class No {

		private int elemento;
		private No proximo;
		
		public void setElemento(int elemento) {
			this.elemento = elemento;
		}
		
		public int getElemento() {
			return this.elemento;
		}
		
		public void setProximo(No proximo) {
			this.proximo = proximo;
		}
		
		public No getProximo() {
			return this.proximo;
		}
}
