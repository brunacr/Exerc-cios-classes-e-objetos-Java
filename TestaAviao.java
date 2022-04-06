package br.com.generation.orientacaoobjetos;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aeronave1 = new Aviao();
		Aviao aeronave2 = new Aviao();
		
		aeronave1.modelo = "Boeing 274";
		aeronave1.empresaAerea = "American Airlines";
		aeronave1.cidadeDestino = "São Paulo";
		
		aeronave2.modelo = "Boeing 737";
		aeronave2.empresaAerea = "TAP Portugal";
		aeronave2.cidadeDestino = "Lisboa";
		
		System.out.println("Modelo da aeronave: " + aeronave1.modelo);
		System.out.println("Empresa proprietária da aeronave: " + aeronave1.empresaAerea);
		System.out.println("O destino da viagem é: " + aeronave1.cidadeDestino);
		aeronave1.decolar();
		aeronave1.arremeter();
		System.out.println();
		
		System.out.println("Modelo da aeronave: " + aeronave2.modelo);
		System.out.println("Empresa proprietária da aeronave: " + aeronave2.empresaAerea);
		System.out.println("O destino da viagem é: " + aeronave2.cidadeDestino);
		aeronave2.decolar();
		aeronave2.pousar();
		System.out.println();
		
	}

}
