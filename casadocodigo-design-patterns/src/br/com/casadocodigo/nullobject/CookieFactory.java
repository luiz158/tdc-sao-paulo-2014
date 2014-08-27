package br.com.casadocodigo.nullobject;

public class CookieFactory {

	public static Carrinho criaCarrinho(HttpServletRequest request) {
		if (request.getAttribute("cookie") != null) {
			return new Carrinho();
		}
		return new CarrinhoVazio();
	}

}
