package observer;

public class SistemDeEstoque implements Observer {

	private Usuario usuario;
	
	private Produto produto;

	public SistemDeEstoque(Usuario usuario, Produto produto) {
		this.usuario = usuario;
		this.produto = produto;
	}

	@Override
	public void executa() {
		System.out.printf("Estoque: Retirando o produto %s comprado pelo usuario %s!\n", produto.getNome(), usuario.getNome());
	}

}
