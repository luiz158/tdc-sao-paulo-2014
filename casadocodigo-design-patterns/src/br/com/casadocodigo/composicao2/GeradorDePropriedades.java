package br.com.casadocodigo.composicao2;

public class GeradorDePropriedades extends GeradorDeArquivo {

	public GeradorDePropriedades() {
		setPosProcessamento(new Compactador());
	}
	
	@Override
	public void gerarConteudo() {
		System.out.println("Gerando arquivo com propriedades");
	}

}
