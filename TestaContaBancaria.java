package br.com.generation.orientacaoobjetos;

public class TestaContaBancaria {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		
		conta1.banco = "Itaú";
		conta1.tipo = "corrente";
		conta1.agencia = 32;
		conta1.conta = 05263;
		conta1.valor = 1000.00;
		
		System.out.println("=============================================================================================================");
		System.out.println();
		conta1.deposito();
		System.out.println("=============================================================================================================");
		System.out.println();
		
		conta2.banco = "Itaú";
		conta2.tipo = "poupança";
		conta2.agencia = 54;
		conta2.conta = 78413;
		conta2.valor = 2500.00;
		
		conta2.deposito();
		System.out.println("=============================================================================================================");
		System.out.println();

	}

}
