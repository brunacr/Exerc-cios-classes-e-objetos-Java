package br.com.generation.orientacaoobjetos;

public class TestaPatinete {

	public static void main(String[] args) {

		Patinete modelo1 = new Patinete();
		Patinete modelo2 = new Patinete();
		Patinete modelo3 = new Patinete();
		Patinete modelo4 = new Patinete();
		
		modelo1.tipo = "Adulto";
		modelo1.cor = "Vermelho";
		modelo1.tamanho = "Grande";
		modelo1.velocidade = 25;
		modelo1.andar();
		System.out.println();
		
		modelo2.tipo = "Infantil";
		modelo2.cor = "Azul";
		modelo2.tamanho = "Pequeno";
		modelo2.velocidade = 10;
		modelo2.andar();
		System.out.println();
		
		modelo3.tipo = "Adulto";
		modelo3.cor = "Verde";
		modelo3.tamanho = "Pequeno";
		modelo3.velocidade = 30;
		modelo3.andar();
		System.out.println();
		
		modelo4.tipo = "Infantil";
		modelo4.cor = "Roxo";
		modelo4.tamanho = "Grande";
		modelo4.velocidade = 15;
		modelo4.andar();
		System.out.println();
		
		
	}

}
