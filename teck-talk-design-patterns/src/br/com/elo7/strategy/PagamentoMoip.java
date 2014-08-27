package br.com.elo7.strategy;

public class PagamentoMoip implements EstrategiaDePagamento {

	public void paga() {
		System.out.println("Se conectando no Moip");
		System.out.println("Chamando API no Moip");
		System.out.println("Enviando valores pro Moip");		
	}

}
