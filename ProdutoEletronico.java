package br.com.generation.orientacaoobjetos;

public class ProdutoEletronico {
	
	String tipo;
	String marca;
	String modelo;
	int ano;
	double valor;
	
	void promocao() {
		System.out.println("*** Produto em promoção ***");
		System.out.println(tipo + " | " + marca + " | " + modelo + " | " + ano + " | " + "R$ " + valor);
	}
	
}

