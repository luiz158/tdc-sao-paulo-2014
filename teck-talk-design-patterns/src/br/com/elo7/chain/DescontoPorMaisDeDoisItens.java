package br.com.elo7.chain;

public class DescontoPorMaisDeDoisItens implements Desconto {

	private Desconto proximo;

	public Double calcula(Pedido pedido) {
		if (pedido.getQuantidadeTotal() > 2) {
			return pedido.getValorTotal() * 0.10;
		}
		else {
			return proximo.calcula(pedido);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
