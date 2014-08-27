package br.com.elo7.chain;

import br.com.elo7.strategy.Item;

public class TestaDesconto {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.adicionaItem(new Item("Adesivo", 20.0));
		pedido.adicionaItem(new Item("Lembrancinha", 100.0));

		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		Double descontoTotal = calculadora.calcula(pedido);
		
		System.out.println("Desconto total: " + descontoTotal);
	}
	
}
