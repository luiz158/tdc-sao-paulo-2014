package br.com.casadocodigo.composicao2;

public class TestaGeradorDeArquivo {

	public static void main(String[] args) {
		GeradorDeArquivo gerador = new GeradorDeXml();
		
		gerador.gerarArquivo();
	}
}
