package br.com.alura.solid.ocp;

public class CalculadoraDePreco {

	private TabelaDePreco tabela;
	
	private ServicoDeEntrega servico;

	public CalculadoraDePreco(TabelaDePreco tabela, ServicoDeEntrega servico) {
		this.tabela = tabela;
		this.servico = servico;
	}
	
	public Double calcula(Produto produto) {
		Double desconto = tabela.calcula(produto.getValor());
		Double frete = servico.para(produto.getCidade());
		
		return frete + (produto.getValor() - desconto);
	}

}
