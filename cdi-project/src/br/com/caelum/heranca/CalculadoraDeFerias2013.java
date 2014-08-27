package br.com.caelum.heranca;

@Calculadora
public class CalculadoraDeFerias2013 implements CalculadoraDeFerias {

	@Override
	public Double calcula() {
		System.out.println("Calculadora de Ferias 2013");
		return 200.0;
	}

}
