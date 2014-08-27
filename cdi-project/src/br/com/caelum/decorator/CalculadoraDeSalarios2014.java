package br.com.caelum.decorator;

import javax.inject.Inject;

@CalculadoraPorAno(ano = 2014)
public class CalculadoraDeSalarios2014 implements CalculadoraDeSalarios {

	@Inject @CalculadoraPorAno
	private CalculadoraDeSalarios delegates;
	
	@Override
	public double calcula() {
		double salario2005 = delegates.calcula();
		System.out.println("Calculando salario da tabela de 2014");
		return salario2005 * 0.1;
	}
}
