package com.pattern.strategy;

public class ImpressoraPdf implements Impressora {

	public void imprime() {
		System.out.println("Codigo Header PDF");
		System.out.println("Codigo Body PDF");
		System.out.println("Codigo Footer PDF");		
	}

}
