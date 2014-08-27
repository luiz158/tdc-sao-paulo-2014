package br.com.elo7.nullobject;

import javax.servlet.http.HttpServletRequest;

public class CarrinhoHelper {

	public static Carrinho pegaCarrinho(HttpServletRequest request) {
		if (request.getAttribute("carrinho") != null) {
			return new Carrinho();
		}
		return new CarrinhoNulo();
	}

}
