package br.com.elo7.strategy;

import java.util.List;

public class SistemaDeEstoque implements AcaoPosPedido {

	public void executa(List<Item> itens) {
		System.out.println("Acessar o banco");
		System.out.println("Retira do estoque os itens: " + itens);		
	}

}
