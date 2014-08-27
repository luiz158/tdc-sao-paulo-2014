package br.com.elo7.typed;

public class CalculadoraAssincronaDeFreteAutomatico extends CalculadoraDeFreteAutomatico {

	@Override
	public Double calcula(Double valor) {
		System.out.println("Calculando Assincronamente");
		return valor * 0.1;
	}
}
