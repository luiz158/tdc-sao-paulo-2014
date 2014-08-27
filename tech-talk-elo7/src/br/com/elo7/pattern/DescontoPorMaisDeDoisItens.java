package br.com.elo7.pattern;

public class DescontoPorMaisDeDoisItens implements RegraDeDesconto {

	private RegraDeDesconto desconto;

	public Double calcula(CarrinhoDeCompras carrinhoDeCompras) {
		if (carrinhoDeCompras.getQuantidadeTotal() > 2) {
			return carrinhoDeCompras.getValorTotal() * 0.10;
		}		
		return desconto.calcula(carrinhoDeCompras);
	}

	@Override
	public void setProximo(RegraDeDesconto desconto) {
		this.desconto = desconto;
	}

}
