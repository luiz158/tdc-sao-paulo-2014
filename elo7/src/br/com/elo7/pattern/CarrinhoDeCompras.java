package br.com.elo7.pattern;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itens = new ArrayList<>();
	
	public void adicionaItem(Item item) {
		this.itens.add(item);
	}

	public CarrinhoPagaPagamento okPraPagamento() {
		return new CarrinhoPagaPagamento();
	}
	
	

}
