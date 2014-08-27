package br.com.casadocodigo.nullobject;

public class TestaCarrinho {

	public static void main(String[] args) {
		HttpServletRequest request = new HttpServletRequest();
		Carrinho carrinho = CookieFactory.criaCarrinho(request);

		//forma ruim pois o nosso codigo cliente precisa validar se o carrinho esta nulo ou nao
		//estas validacoes podem se espalhar pelo codigo
		if (carrinho != null) {
			request.setAttribute("valor", carrinho.getValor());
			request.setAttribute("quantidade", carrinho.getQuantidade());
		} else {
			request.setAttribute("valor", 0.0);
			request.setAttribute("quantidade", 0.0);
		}
		
		if (request.getAttribute("username") == null) {
			if (carrinho != null) {
				request.setAttribute("userCarrinho", carrinho.getUsername());
			} else {
				request.setAttribute("userCarrinho", "<div><a href='login.jsp'>Logar</a></div>");
			}
		} else {
			request.setAttribute("userCarrinho", request.getAttribute("username"));
		}
	}
	
}
