package observer;

public class SistemaFinanceiro implements Observer {

	private Usuario usuario;
	
	private Produto produto;

	public SistemaFinanceiro(Usuario usuario, Produto produto) {
		this.usuario = usuario;
		this.produto = produto;
	}

	@Override
	public void executa() {
		System.out.printf("Financeiro: Cobrando o usuario %s pela compra do produto %s!\n", usuario.getNome(), produto.getNome());
	}

}
