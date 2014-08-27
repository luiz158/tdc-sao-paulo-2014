package br.com.casadocodigo.factorymethod;

public class ProdutoDao extends Dao<Produto> {

	@Override
	public Produto buscaPorId(Object id) {
		Produto produto = new Produto((Long) id, 0.0);
		return produto;
	}

	@Override
	public void salva(Object object) {
		Produto produto = (Produto) object;
		
		System.out.printf("Salvando o Produto: %s", produto.getId());
	}

}
