package br.com.generation.orientacaoobjetos;

public class ContaBancaria {
	
	String banco;
	String tipo;
	int agencia;
	int conta;
	double valor;
	
	void deposito(){
		System.out.println("O dep�sito ser� feito para o banco " + banco + ", conta " + tipo + ", ag�ncia " + agencia + ". O valor do dep�sito ser� de R$ " + valor + ".");
		System.out.println();
	}
	

}
