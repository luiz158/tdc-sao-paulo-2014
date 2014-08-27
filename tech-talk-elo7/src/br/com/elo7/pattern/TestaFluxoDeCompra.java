package br.com.elo7.pattern;

public class TestaFluxoDeCompra {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaItem(new Item("Lembrancinha", 200));
		carrinho.adicionaItem(new Item("Bone", 50));
		
		carrinho.fazPagamento(new PagamentoViaPayPal());
		carrinho.fazPagamento(new Boleto());
		
		carrinho.adicionaAcao(new SistemaDeEstoque());
		carrinho.adicionaAcao(new SistemaFinanceiro());
		carrinho.finalizaPedido();
	}
	
}
