package br.com.elo7.pattern;

public class PagamentoViaPayPal implements EstrategiaDePagamento {

	public void finaliza(Double valorTotal) {
		System.out.println("Se conecta no PayPal");
		System.out.println("Envia usuario para PayPal");
		System.out.println("Recebe retorno do PayPal");		
	}

}
