package br.com.casadocodigo.factorymethod;

public abstract class ServicoAbstrato<T> {

	private GeradorDeArquivo gerador;

	public ServicoAbstrato(GeradorDeArquivo gerador) {
		this.gerador = gerador;
	}
	
	public void geraArquivoDaEntidade(Object id, String nomeDoArquivo) {
		T entidade = getDao().buscaPorId(id);
		System.out.println(entidade);
		gerador.gera(id, nomeDoArquivo);
	}
	
	//Factory Method
	abstract Dao<T> getDao(); //Aqui delegamos para a subclasse a criacao da instancia correta
	
}
