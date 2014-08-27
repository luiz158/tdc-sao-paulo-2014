package br.com.elo7.strategy;

public class PagamentoPayPal implements EstrategiaDePagamento {

	public void paga() {
		System.out.println("Se conectando no PayPal");
		System.out.println("Chamando API no PayPal");
		System.out.println("Enviando valores pro PayPal");		
	}

}
