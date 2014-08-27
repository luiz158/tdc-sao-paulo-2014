package br.com.elo7.heranca;

import javax.enterprise.inject.Specializes;

//@Alternative @Priority(Interceptor.Priority.APPLICATION + 1000)
@Specializes
public class CalculadoraAssincronaDeFreteAutomatico extends CalculadoraDeFreteAutomatico {

	@Override
	public Double calcula(Double valor) {
		System.out.println("Calculando Frete Assincronamente");
		
		return valor * 0.7;
	}
}
