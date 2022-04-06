package br.com.generation.orientacaoobjetos;

public class ContaBancaria {
	
	String banco;
	String tipo;
	int agencia;
	int conta;
	double valor;
	
	void deposito(){
		System.out.println("O depósito será feito para o banco " + banco + ", conta " + tipo + ", agência " + agencia + ". O valor do depósito será de R$ " + valor + ".");
		System.out.println();
	}
	

}
