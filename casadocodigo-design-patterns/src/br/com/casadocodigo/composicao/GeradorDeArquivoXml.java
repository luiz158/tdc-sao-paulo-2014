package br.com.casadocodigo.composicao;

public class GeradorDeArquivoXml extends GeradorDeArquivo {

	@Override
	public void processar() {
		System.out.println("Processando Arquivo Xml");
	}

	@Override
	public void gerarConteudo() {
		System.out.println("Gerando Conteudo do Arquivo Xml");
	}

}
