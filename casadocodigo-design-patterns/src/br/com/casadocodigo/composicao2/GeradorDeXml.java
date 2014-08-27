package br.com.casadocodigo.composicao2;

public class GeradorDeXml extends GeradorDeArquivo {
	
	public GeradorDeXml() {
		setPosProcessamento(new Criptografador());
	}
	
	@Override
	public void gerarConteudo() {
		System.out.println("Gerar conteudo em Xml");
	}

}
