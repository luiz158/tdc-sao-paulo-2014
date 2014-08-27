package observer;

public class EnviadorDeEmail implements Observer {

	private Usuario usuario;
	
	private Produto produto;

	public EnviadorDeEmail(Usuario usuario, Produto produto) {
		this.usuario = usuario;
		this.produto = produto;
	}
	
	@Override
	public void executa() {
		System.out.printf("Email: Parabens %s! Voce comprou o produto %s!\n", usuario.getNome(), produto.getNome());
	}

}
