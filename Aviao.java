package br.com.generation.orientacaoobjetos;

public class Aviao {
	
	String modelo;
	String empresaAerea;
	String cidadeDestino;
	
	
	void decolar() {
		System.out.println("Senhoras e senhores, bem-vindos ao voo com destino a " + cidadeDestino);
	}
	
	void pousar() {
		System.out.println("Pouso realizado com sucesso!");
	}
	
	void arremeter() {
		System.out.println("Aproximação para o pouso com instabilidade");
	}
	
}
	
