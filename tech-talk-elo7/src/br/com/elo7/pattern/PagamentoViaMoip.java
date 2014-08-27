package br.com.elo7.pattern;

public class PagamentoViaMoip implements EstrategiaDePagamento {

	public void finaliza(Double valorTotal) {
		System.out.println("Se conecta no Moip");
		System.out.println("Envia usuario para Moip");
		System.out.println("Recebe retorno do Moip");		
	}

}
