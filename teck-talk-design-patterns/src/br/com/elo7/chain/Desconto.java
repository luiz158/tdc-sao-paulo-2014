package br.com.elo7.chain;

public interface Desconto {

	public Double calcula(Pedido pedido);
	
	void setProximo(Desconto proximo);
	
}
