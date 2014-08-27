package br.com.elo7.strategy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itens = new ArrayList<>();
	
	private List<AcaoPosPedido> acoes = new ArrayList<>();
	
	public void adicionaProduto(Item item) {
		itens.add(item);
	}

	public void fazPagamento(EstrategiaDePagamento pagamento) {
		pagamento.paga();
	}

	public void finalizaPedido() {
		for (AcaoPosPedido acao : acoes) {
			acao.executa(itens);
		}
	}
	
	public void adicionaAcao(AcaoPosPedido acao) {
		this.acoes.add(acao);
	}

}
