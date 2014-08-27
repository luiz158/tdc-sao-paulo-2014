package br.com.elo7.interceptor;


public class CalculadoraAssincronaDeFreteAutomatico extends CalculadoraDeFreteAutomatico {
	
	@Override @Logger
	public Double calcula(Double valor) {
		System.out.println("Calculando Assincronamente");
		return valor * 0.1;
	}
	
}
