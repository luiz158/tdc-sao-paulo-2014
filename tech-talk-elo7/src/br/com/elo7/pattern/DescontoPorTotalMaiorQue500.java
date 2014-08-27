package br.com.elo7.pattern;

public class DescontoPorTotalMaiorQue500 implements RegraDeDesconto {

	private RegraDeDesconto desconto;

	@Override
	public Double calcula(CarrinhoDeCompras carrinhoDeCompras) {
		if (carrinhoDeCompras.getValorTotal() > 200) {
			return carrinhoDeCompras.getValorTotal() * 0.30;
		}
		return desconto.calcula(carrinhoDeCompras);
	}

	@Override
	public void setProximo(RegraDeDesconto desconto) {
		this.desconto = desconto;
	}

}
