package br.com.elo7.lazyselect;

public class CalculadoraAssincronaDeFreteAutomatico implements CalculadoraDeFrete {

	@Override
	public Double calcula(Double valor) {
		System.out.println("Calculando Assincronamente");
		return valor * 0.1;
	}
	
}
