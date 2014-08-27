package br.com.elo7.strategy;

import java.util.List;

public class SistemaFinanceiro implements AcaoPosPedido {

	public void executa(List<Item> itens) {
		System.out.println("Gerar nota no Financeiro dos seguintes itens: " + itens);
		System.out.println("Gerar nota fiscal de acordo com o CPF do brother");		
	}

}
