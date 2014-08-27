package br.com.elo7.observer;

public class TestaFecharCompra {

	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho();
		
		carrinho.adicionaAcao(new Financeiro());
		carrinho.adicionaAcao(new EnviadorDeEmail());
		
		carrinho.finalizaPedido();
	}
	
}
