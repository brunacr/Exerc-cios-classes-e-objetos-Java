package br.com.generation.orientacaoobjetos;

public class Funcionario {
	
	String nome;
	String cargo;
	int anoContratacao;
	double salario;
	
	void pagamento() {
		System.out.println("Funcion�rio: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Contratado em: " + anoContratacao);
		System.out.println("Sal�rio: " + salario);
	}
	
}
