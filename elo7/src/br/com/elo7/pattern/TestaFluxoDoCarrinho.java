package br.com.elo7.pattern;

public class TestaFluxoDoCarrinho {
 
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaItem(new Item("Lembrancinha", 20.0));
		carrinho.adicionaItem(new Item("Baianao", 10.0));
		
		CarrinhoPagaPagamento okPraPagamento = carrinho.okPraPagamento();
		if (okPraPagamento != null) {
			okPraPagamento.fazPagamento(new PagamentoViaPayPal());
		}
	}
	
}
