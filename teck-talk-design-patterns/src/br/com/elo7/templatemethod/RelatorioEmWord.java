package br.com.elo7.templatemethod;

public class RelatorioEmWord extends Relatorio {

	@Override
	protected void imprimeConteudo(String conteudo) {
		System.out.println("Relatorio em WORD");
		System.out.println(conteudo);
	}

}
