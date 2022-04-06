package br.com.generation.orientacaoobjetos;

public class Paciente {
	
	int prontuario;
	String nome;
	int idade;
	String sexo;
	String estadoSaude;
	String procedimento;
	
	void avaliacao() {
		System.out.println("Prontuário: " + prontuario);
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Situação: " + estadoSaude);
		System.out.println("Procedimento: " + procedimento);
		
	}

}
