package br.com.caelum.modelo;

import javax.annotation.PostConstruct;
import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.interceptor.Interceptor;

@Alternative
@Priority(Interceptor.Priority.APPLICATION + 1)
public class CalculadoraDeSalarios2005 implements CalculadoraDeSalarios {

	public CalculadoraDeSalarios2005() {
		System.out.println("Iniciando a Calculadra de Salarios..");
	}
	
	@PostConstruct
	public void pronta() {
		System.out.println("Calculadora de salarios pronta");
	}

	public Double calculaSalario(Funcionario funcionario) {
		if (funcionario.getCargo().equals(Cargo.ENGENHEIRO)) {
			return funcionario.getSalarioBase() * 0.30;
		} else if (funcionario.getCargo().equals(Cargo.ARQUITETO)) {
			return funcionario.getSalarioBase() * 0.20;
		} else {
			return funcionario.getSalarioBase() * 0.10;
		}
	}
	
}
