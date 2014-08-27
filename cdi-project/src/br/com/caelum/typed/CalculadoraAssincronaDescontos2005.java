package br.com.caelum.typed;

import javax.enterprise.inject.Typed;

@Typed({CalculadoraDeDescontos.class, CalculadoraAssincronaDescontos2005.class}) //Podemos tipar a nossa classe com somente o Tipo que queremos que ela responda para a injecao
public class CalculadoraAssincronaDescontos2005 extends CalculadoraDeDescontos2005 {

	@Override
	public Double calcula() {
		System.out.println("Calculando desconto com Calculadora 2005");
		return 200.0;
	}
	
}
