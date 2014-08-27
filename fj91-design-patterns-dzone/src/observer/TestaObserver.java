package observer;

public class TestaObserver {

	public static void main(String[] args) {
		CarrinhoDeComprasController carrinho = new CarrinhoDeComprasController();
		Usuario usuario = new Usuario("Alexandre Gama");
		Produto produto = new Produto("Galaxy S3");
		
		carrinho.registraObservador(new EnviadorDeEmail(usuario, produto));
		carrinho.registraObservador(new SistemDeEstoque(usuario, produto));
		carrinho.registraObservador(new SistemaFinanceiro(usuario, produto));
		
		carrinho.finaliza(usuario, produto);
	}
	
}
