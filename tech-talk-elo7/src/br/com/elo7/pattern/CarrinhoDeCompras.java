package br.com.elo7.pattern;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itens = new ArrayList<>();
	
	private List<AcaoPosPedido> acoes = new ArrayList<>();

	private Double valorTotal = 0.0;
	
	public void adicionaItem(Item item) {
		this.itens.add(item);
	}

	public void fazPagamento(EstrategiaDePagamento pagamento) {
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		Double desconto = calculadoraDeDesconto.calcula(this);
		
		valorTotal = valorTotal - desconto;
		pagamento.finaliza(valorTotal);
	}

	public void finalizaPedido() {
		for (AcaoPosPedido acao : acoes) {
			acao.finaliza(itens);
		}
	}

	public void adicionaAcao(AcaoPosPedido acao) {
		this.acoes.add(acao);
	}

	public int getQuantidadeTotal() {
		return this.itens.size();
	}

	public double getValorTotal() {
		for(Item item: itens) {
			valorTotal += valorTotal + item.getValor();
		}
		return this.valorTotal;
	}

}
