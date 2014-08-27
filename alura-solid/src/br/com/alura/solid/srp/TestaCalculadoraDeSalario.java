package br.com.alura.solid.srp;

public class TestaCalculadoraDeSalario {

	public static void main(String[] args) {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		
		Double salarioAlexandre = calculadora.calcula(new Funcionario("Alexandre Gama", Cargo.ENGENHEIRO, 1000.0));
		System.out.println(salarioAlexandre);
		
		Double salarioFernando = calculadora.calcula(new Funcionario("Fernando Gama", Cargo.CONSULTOR, 1500.0));
		System.out.println(salarioFernando);
	}
	
}
