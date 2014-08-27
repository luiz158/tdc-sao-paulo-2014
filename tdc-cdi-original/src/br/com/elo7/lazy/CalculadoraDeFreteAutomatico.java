package br.com.elo7.lazy;

import javax.annotation.PostConstruct;

public class CalculadoraDeFreteAutomatico implements CalculadoraDeFrete {
	
	@PostConstruct
	public void depoisDeConstruir() {
		System.out.println("Calculadora ja foi construida");
	}
	
	@Override
	public Double calcula(Double valor) {
		System.out.println("Calculando Sincronamente");
		
		return valor * 0.9;
	}
	
}
