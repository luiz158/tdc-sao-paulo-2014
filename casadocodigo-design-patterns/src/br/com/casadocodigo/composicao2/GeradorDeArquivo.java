package br.com.casadocodigo.composicao2;

public abstract class GeradorDeArquivo {

	private PosProcessamento posProcessamento;
	
	public abstract void gerarConteudo();

	public GeradorDeArquivo() {
		this.posProcessamento = new NullProcessador();
	}
	
	public void setPosProcessamento(PosProcessamento posProcessamento) {
		this.posProcessamento = posProcessamento;
	}	
	
	public void gerarArquivo() {
		System.out.println("Iniciando geracao de arquivo..");
		
		gerarConteudo();
		posProcessamento.processa(); //Podemos iterar com varios pos processadores
		
		System.out.println("Finalizando geracao de arquivo..");
	}
	
}
