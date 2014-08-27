package br.com.elo7.pattern;

public class CalculadoraDeDesconto {

	public Double calcula(CarrinhoDeCompras carrinhoDeCompras) {
		RegraDeDesconto d1 = new DescontoPorMaisDeDoisItens();
		RegraDeDesconto d2 = new DescontoPorTotalMaiorQue100();
		RegraDeDesconto d3 = new DescontoPorTotalMaiorQue500();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		return 0.0;
	}

}
