package br.com.elo7.strategy;

import java.util.List;

public class EnviadorDeEmail implements AcaoPosPedido {

	public void executa(List<Item> itens) {
		System.out.println("Email de sucesso");
		System.out.println("Voce acaba de comprar os seguintes itens: " + itens);
		System.out.println("Email de logo mais acusamos seu pagamento");		
	}

}
