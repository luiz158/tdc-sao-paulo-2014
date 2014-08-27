package br.com.elo7.state;

import java.util.ArrayList;
import java.util.List;

import br.com.elo7.strategy.Item;

public class Orcamento {

	private List<Item> itens = new ArrayList<>();
	
	public EstadoDoOrcamento estadoAtual;
	
	protected double valor;
	
	public Orcamento(double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return itens;
	}
	
	public void calculaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		
	}
	
}
