package br.com.elo7.templatemethod;

public class RelatorioEmPdf extends Relatorio {

	@Override
	protected void imprimeConteudo(String conteudo) {
		System.out.println("Conteudo em PDF");
		System.out.println("conteudo");
	}

}
