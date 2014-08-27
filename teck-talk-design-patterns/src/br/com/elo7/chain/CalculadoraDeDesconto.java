package br.com.elo7.chain;

public class CalculadoraDeDesconto {

	public Double calcula(Pedido pedido) {
		Desconto d1 = new DescontoPorMaisDeDoisItens();
		Desconto d2 = new DescontoPorMaisDe100Reais();
		Desconto semDesconto = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(semDesconto);
		
		return d1.calcula(pedido);
	}

}
