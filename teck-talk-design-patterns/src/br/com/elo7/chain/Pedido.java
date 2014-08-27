package br.com.elo7.chain;

import java.util.ArrayList;
import java.util.List;

import br.com.elo7.strategy.Item;

public class Pedido {

	private List<Item> itens = new ArrayList<>();
	
	public void adicionaItem(Item item) {
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return itens;
	}

	public double getValorTotal() {
		Double valor = 0.0;
		for (Item item : itens) {
			valor += item.getValor();
		}
		return valor;
	}

	public int getQuantidadeTotal() {
		return this.itens.size();
	}
	
	
}
