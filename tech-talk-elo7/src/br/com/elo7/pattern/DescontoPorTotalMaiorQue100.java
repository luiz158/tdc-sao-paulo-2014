package br.com.elo7.pattern;

public class DescontoPorTotalMaiorQue100 implements RegraDeDesconto {

	private RegraDeDesconto desconto;

	public Double calcula(CarrinhoDeCompras carrinhoDeCompras) {
		if (carrinhoDeCompras.getValorTotal() > 100) {
			return carrinhoDeCompras.getValorTotal() * 0.20;
		}
		return desconto.calcula(carrinhoDeCompras);
	}

	@Override
	public void setProximo(RegraDeDesconto desconto) {
		this.desconto = desconto;
	}

}
