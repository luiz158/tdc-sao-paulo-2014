package br.com.elo7.nullobject;

public class CarrinhoNulo extends Carrinho {

	@Override
	public Double getDesconto() {
		return 20.0;
	}

	@Override
	public Double getValorTotal() {
		return 0.0;
	}
	
	@Override
	public String getUsuarioLogado() {
		return "<a href='login.html'>Login<a>";
	}
	
}
