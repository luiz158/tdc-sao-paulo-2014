package br.com.elo7.chain;

public class DescontoPorMaisDe100Reais implements Desconto {

	private Desconto proximo;

	public Double calcula(Pedido pedido) {
		if (pedido.getValorTotal() > 100.0) {
			return pedido.getValorTotal() * 0.20;
		}
		return proximo.calcula(pedido);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
