package br.com.casadocodigo.composicao;

public class GeradorDeArquivoCriptografado extends GeradorDeArquivo {

	@Override
	public void processar() {
		System.out.println("Processando Arquivo Criptografado");
	}

	@Override
	public void gerarConteudo() {
		System.out.println("Gerando Conteudo do Arquivo Criptografado");
	}

}
