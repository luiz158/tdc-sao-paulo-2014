package br.com.elo7.strategy;

public class PagamentoBoleto implements EstrategiaDePagamento {

	@Override
	public void paga() {
		System.out.println("Boleto");
	}

}
