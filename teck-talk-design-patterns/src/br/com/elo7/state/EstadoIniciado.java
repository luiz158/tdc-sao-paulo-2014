package br.com.elo7.state;

public class EstadoIniciado implements EstadoDoOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor = orcamento.valor - (orcamento.valor * 0.10);		
	}

}
