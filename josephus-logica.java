ArrayList<String> soldado = new ArrayList<String>();

soldado.add("A"); 
soldado.add("B");
soldado.add("C");
soldado.add("D");
soldado.add("E");
soldado.add("F");
posicao = 2;
numero = 2;

posicao = posicao + numero;
while (soldado.size() != 1) {
	if (posicao > soldado.size()) {
		posicao = posicao - soldado.size();
	}else {
		soldado.remove(posicao-1);
		posicao = (posicao-1) + numero;
	}
	system.out.println(soldado);
}
