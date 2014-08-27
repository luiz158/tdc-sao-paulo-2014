package br.com.casadocodigo.factorymethod;

public class GeradorDePdf implements GeradorDeArquivo {

	@Override
	public void gera(Object id, String nomeDoArquivo) {
		System.out.println("Gerando PDF");
	}

}
