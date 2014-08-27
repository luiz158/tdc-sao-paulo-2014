package br.com.elo7.nullobject;

import javax.servlet.http.HttpServletRequest;

public class MostraCarrinhoNaViewMobile {

	public void show(HttpServletRequest request) {
		Carrinho carrinho = CarrinhoHelper.pegaCarrinho(request);
		
		if (carrinho != null) {
			request.setAttribute("valorTotal", carrinho.getValorTotal());
			request.setAttribute("desconto", carrinho.getDesconto());
		} else {
			request.setAttribute("valorTotal", 0.0);
			request.setAttribute("desconto", 20.0);
		}
		
		if (request.getAttribute("usuarioLogado") == null) {
			if (carrinho != null) {
				request.setAttribute("usuarioCarrinho", carrinho.getUsuarioLogado());
			} else {
				request.setAttribute("usuarioCarrinho", "<a href='login.jsp'>Login<a>");
			}
		} else {
			request.setAttribute("usuarioCarrinho", request.getAttribute("usuarioLogado"));
		}
	}
	
}
