package com.pattern.strategy;

public class MaquinaDeImprimir {

	private Impressora impressora;

	public void setImpressora(Impressora impressora) {
		this.impressora = impressora;
	}
	
	public void imprime() {
		this.impressora.imprime();
	}
	
}
