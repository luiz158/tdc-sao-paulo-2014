package br.com.alura.solid.ocp;

public class TestaCalculadoraDePreco {

	public static void main(String[] args) {
		TabelaDePreco tabela = new TabelaDePrecoPadrao();
		ServicoDeEntrega servico = new Frete();
		
		CalculadoraDePreco calculadora = new CalculadoraDePreco(tabela, servico);
		Double valorTotal = calculadora.calcula(new Produto());
		
		System.out.println(valorTotal);
	}
	
}
