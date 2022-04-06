package br.com.generation.orientacaoobjetos;

public class Patinete {
	
	String tipo;
	String cor;
	String tamanho;
	int velocidade;
	
	void andar() {
		System.out.println("Patinete " + tipo + ", " + cor + ", " + tamanho + " está andando a " + velocidade + " km/h");
	}
	

}
