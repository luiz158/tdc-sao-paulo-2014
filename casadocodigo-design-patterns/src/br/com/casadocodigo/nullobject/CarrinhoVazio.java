package br.com.casadocodigo.nullobject;

public class CarrinhoVazio extends Carrinho {

	@Override
	public Double getValor() {
		return 0.0;
	}
	
	@Override
	public Double getQuantidade() {
		return 0.0;
	}
	
	@Override
	public String getUsername() {
		return "<div><a href='login.jsp'>Logar</a></div>";
	}
}
