package br.com.generation.orientacaoobjetos;

public class TestaProdutoEletronico {

	public static void main(String[] args) {

		ProdutoEletronico aparelho = new ProdutoEletronico();
		ProdutoEletronico aparelho2 = new ProdutoEletronico();
		
		aparelho.tipo = "Smartphone";
		aparelho.marca = "Samsung";
		aparelho.modelo = "S20";
		aparelho.ano = 2020;
		aparelho.valor = 2289.10;
		aparelho.promocao();
		
		System.out.println();
		System.out.println();
		
		aparelho2.tipo = "Smart TV";
		aparelho2.marca = "LG";
		aparelho2.modelo = "32LM621";
		aparelho2.ano = 2020;
		aparelho2.valor = 1429.00;
		aparelho2.promocao();
		
	}

}
