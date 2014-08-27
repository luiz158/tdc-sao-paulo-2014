package br.com.casadocodigo.composicao;

public abstract class GeradorDeArquivo {

	public void gerarArquivo() {
		processar();
		
		gerarConteudo();
	}

	public abstract void processar();
	
	public abstract void gerarConteudo();
	
}
