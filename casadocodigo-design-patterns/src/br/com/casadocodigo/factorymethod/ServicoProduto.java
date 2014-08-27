package br.com.casadocodigo.factorymethod;

public class ServicoProduto extends ServicoAbstrato<Produto> {

	public ServicoProduto(GeradorDeArquivo gerador) {
		super(gerador);
	}

	private Dao<Produto> dao;
	
	//Factory Method sendo implementado
	@Override
	public Dao<Produto> getDao() {
		if (this.dao == null) {
			this.dao = new ProdutoDao();
		} 
		return this.dao;
	}
	
	public Double getPrecoProduto(Object id) {
		Produto produto = getDao().buscaPorId(id);
		return produto.getPreco();
	}

}
