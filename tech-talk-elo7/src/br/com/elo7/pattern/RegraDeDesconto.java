package br.com.elo7.pattern;

public interface RegraDeDesconto {

	public Double calcula(CarrinhoDeCompras carrinhoDeCompras);
	
	public void setProximo(RegraDeDesconto desconto);
	
}
