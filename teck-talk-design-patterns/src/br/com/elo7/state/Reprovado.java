package br.com.elo7.state;

public class Reprovado {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor = orcamento.valor - (orcamento.valor * 0.20);		
	}

}
