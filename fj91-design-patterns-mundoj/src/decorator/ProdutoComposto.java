package decorator;

public class ProdutoComposto extends ProdutoDecorator {

	public ProdutoComposto(Produto produtoOriginal) {
		this.original = produtoOriginal;
	}

	@Override
	public Double calculaPreco() {
		Double totalPadrao = this.original.calculaPreco();
		return totalPadrao * 0.12;
	}
	
}
