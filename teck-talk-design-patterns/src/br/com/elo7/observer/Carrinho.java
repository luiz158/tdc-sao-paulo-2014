package br.com.elo7.observer;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<PosPedido> acoes = new ArrayList<>();
	
	public void finalizaPedido() {
		System.out.println("Finalizando o Pedido");
		
		for (PosPedido acao: acoes) {
			acao.processa();
		}
	}

	public void adicionaAcao(PosPedido posPedido) {
		this.acoes.add(posPedido);
	}
}
