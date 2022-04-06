package br.com.generation.orientacaoobjetos;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente pessoa1 = new Paciente();
		Paciente pessoa2 = new Paciente();
		Paciente pessoa3 = new Paciente();
		
		pessoa1.prontuario = 1023;
		pessoa1.nome = "Roberto";
		pessoa1.idade = 47;
		pessoa1.sexo = "Masculino";
		pessoa1.estadoSaude = "Muito urgente";
		pessoa1.procedimento = "Cirurgia";
		pessoa1.avaliacao();
		System.out.println();
		System.out.println();
		
		pessoa2.prontuario = 1024;
		pessoa2.nome = "José";
		pessoa2.idade = 52;
		pessoa2.sexo = "Masculino";
		pessoa2.estadoSaude = "Urgente";
		pessoa2.procedimento = "Internação";
		pessoa2.avaliacao();
		System.out.println();
		System.out.println();
		
		pessoa3.prontuario = 1025;
		pessoa3.nome = "Suzana";
		pessoa3.idade = 36;
		pessoa3.sexo = "Feminino";
		pessoa3.estadoSaude = "Não urgente";
		pessoa3.procedimento = "Consulta";
		pessoa3.avaliacao();
		System.out.println();
		System.out.println();

	}

}
