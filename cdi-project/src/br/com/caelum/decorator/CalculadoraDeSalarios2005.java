package br.com.caelum.decorator;

@CalculadoraPorAno(ano = 2005)
public class CalculadoraDeSalarios2005 implements CalculadoraDeSalarios {

	@Override
	public double calcula() {
		System.out.println("Calculando salario da tabela de 2005");
		return 10.0;
	}

}
