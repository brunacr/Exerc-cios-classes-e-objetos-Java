package br.com.generation.orientacaoobjetos;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.nome = "Maria";
		cliente1.cpf = 1234567890;
		cliente1.cidade = "Brasília";
		cliente1.telefone = 987654321;
		
		cliente2.nome = "João";
		cliente2.cpf = 1472583690;
		cliente2.cidade = "Salvador";
		cliente2.telefone = 943218765;
		
		System.out.println("Nome do cliente: " + cliente1.nome);
		System.out.println("CPF do cliente: " + cliente1.cpf);
		System.out.println("Cidade do cliente: " + cliente1.cidade);
		System.out.println("Telefone do cliente: " + cliente1.telefone);
		cliente1.comprar();
		cliente1.trocar();
		System.out.println();
		
		System.out.println("Nome do cliente: " + cliente2.nome);
		System.out.println("CPF do cliente: " + cliente2.cpf);
		System.out.println("Cidade do cliente: " + cliente2.cidade);
		System.out.println("Telefone do cliente: " + cliente2.telefone);
		cliente1.comprar();
		cliente1.trocar();
		System.out.println();	

	}

}
