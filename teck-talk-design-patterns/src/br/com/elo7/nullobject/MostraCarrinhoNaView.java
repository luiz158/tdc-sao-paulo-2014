package br.com.elo7.nullobject;

import javax.servlet.http.HttpServletRequest;

public class MostraCarrinhoNaView {

	public void show(HttpServletRequest request) {
		Carrinho carrinho = CarrinhoHelper.pegaCarrinho(request);
		
		request.setAttribute("valorTotal", carrinho.getValorTotal());
		request.setAttribute("desconto", carrinho.getDesconto());
		
		if (request.getAttribute("usuarioLogado") == null) {
			request.setAttribute("usuarioCarrinho", carrinho.getUsuarioLogado());
		} else {
			request.setAttribute("usuarioCarrinho", request.getAttribute("usuarioLogado"));
		}
	}
	
}
