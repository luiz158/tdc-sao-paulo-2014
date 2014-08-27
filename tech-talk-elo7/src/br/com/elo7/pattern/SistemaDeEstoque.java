package br.com.elo7.pattern;

import java.util.List;

public class SistemaDeEstoque implements AcaoPosPedido {

	public void finaliza(List<Item> itens) {
		System.out.println("Acessa o Estoque");
		System.out.println("Retirar os itens: " + itens);
		System.out.println("Maracutaia a mais no estoque");		
	}

}
