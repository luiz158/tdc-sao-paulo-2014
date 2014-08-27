package br.com.elo7.strategy;

public class TestaFluxoDeCompra {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaProduto(new Item());
		
		carrinho.fazPagamento(new PagamentoBoleto());
		
		carrinho.adicionaAcao(new SistemaDeEstoque());
		carrinho.adicionaAcao(new EnviadorDeEmail());
		carrinho.adicionaAcao(new SistemaFinanceiro());
		
		carrinho.finalizaPedido();
	}
	
}
