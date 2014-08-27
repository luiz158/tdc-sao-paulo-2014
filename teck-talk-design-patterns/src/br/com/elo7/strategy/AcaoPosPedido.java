package br.com.elo7.strategy;

import java.util.List;

public interface AcaoPosPedido {

	void executa(List<Item> itens);
}
