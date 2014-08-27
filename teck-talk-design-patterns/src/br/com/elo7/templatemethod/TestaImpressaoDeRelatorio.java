package br.com.elo7.templatemethod;

public class TestaImpressaoDeRelatorio {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		RelatorioEmHtml relatorioEmHtml = new RelatorioEmHtml();
		
//		Impressora impressora = new Impressora(new RelatorioEmPdf());
		Impressora impressora = new Impressora(new RelatorioEmWord());
//		Impressora impressora = new Impressora(new RelatorioEmHtml());
		impressora.imprime("Meu Conteudo");
	}
	
}
