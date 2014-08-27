package br.com.elo7.pattern;

import java.util.List;

public class SistemaFinanceiro implements AcaoPosPedido {

	public void finaliza(List<Item> itens) {
		System.out.println("Acessa o Financeiro");
		System.out.println("Envia fatura com os itens: " + itens);
		System.out.println("Criar nota fiscal do cliente" + itens);		
	}

}
