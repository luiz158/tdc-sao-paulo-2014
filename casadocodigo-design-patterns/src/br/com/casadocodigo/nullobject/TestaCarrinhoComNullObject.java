package br.com.casadocodigo.nullobject;

public class TestaCarrinhoComNullObject {

	public static void main(String[] args) {
		HttpServletRequest request = new HttpServletRequest();
		Carrinho carrinho = CookieFactory.criaCarrinho(request);

		request.setAttribute("valor", carrinho.getValor());
		request.setAttribute("quantidade", carrinho.getQuantidade());
		
		if (request.getAttribute("username") == null) {
			request.setAttribute("userCarrinho", carrinho.getUsername());
		} else {
			request.setAttribute("userCarrinho", request.getAttribute("username"));
		}
	}
	
}
