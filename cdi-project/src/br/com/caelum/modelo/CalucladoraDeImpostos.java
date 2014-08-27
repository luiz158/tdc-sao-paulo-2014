package br.com.caelum.modelo;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class CalucladoraDeImpostos {

	@Inject
	private CalculadoraDeSalarios calculadoraDeSalarios;
	
	public CalucladoraDeImpostos() {
		System.out.println("Iniciando Calculadora de Impostos...");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Calculadora de Impostos pronta!");
	}
	
	public Double calculaImpostoDeRenda(Funcionario funcionario) {
		return calculadoraDeSalarios.calculaSalario(funcionario);
	}
	
}
