package br.com.elo7.pattern;

import java.util.List;

public class EnviadorDeEmail implements AcaoPosPedido {

	public void finaliza(List<Item> itens) {
		System.out.println("Compra efetuada com sucesso");
		System.out.println("Voce comprou os seguitnes itens: " + itens);
		System.out.println("Maracutais do envio de email");		
	}

}
