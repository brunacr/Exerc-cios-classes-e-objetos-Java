package br.com.generation.orientacaoobjetos;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario matricula1 = new Funcionario();
		Funcionario matricula2 = new Funcionario();
		Funcionario matricula3 = new Funcionario();

		matricula1.nome = "Carlos";
		matricula1.cargo = "Contador";
		matricula1.anoContratacao = 2015;
		matricula1.salario = 4700.00;
		matricula1.pagamento();
		System.out.println();
		
		matricula2.nome = "Fernanda";
		matricula2.cargo = "Engenheira";
		matricula2.anoContratacao = 2018;
		matricula2.salario = 6900.00;
		matricula2.pagamento();
		System.out.println();
		
		matricula3.nome = "Marcela";
		matricula3.cargo = "Assistente Administrativa";
		matricula3.anoContratacao = 2012;
		matricula3.salario = 3200.00;
		matricula3.pagamento();
		System.out.println();
		
	}

}
