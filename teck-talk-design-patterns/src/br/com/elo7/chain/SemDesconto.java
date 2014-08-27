package br.com.elo7.chain;

public class SemDesconto implements Desconto {

	@Override
	public Double calcula(Pedido pedido) {
		return 0.0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		//nao faz nada
	}

}
