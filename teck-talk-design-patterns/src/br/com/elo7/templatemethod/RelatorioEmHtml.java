package br.com.elo7.templatemethod;

public class RelatorioEmHtml extends Relatorio {

	@Override
	protected void imprimeConteudo(String conteudo) {
		System.out.println("Conteudo em HTML");
		System.out.println(conteudo);
	}
	
}
