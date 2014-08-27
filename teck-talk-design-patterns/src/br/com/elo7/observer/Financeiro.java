package br.com.elo7.observer;

public class Financeiro implements PosPedido {

	@Override
	public void processa() {
		System.out.println("Gerar nota no Financeiro");		
	}

}
