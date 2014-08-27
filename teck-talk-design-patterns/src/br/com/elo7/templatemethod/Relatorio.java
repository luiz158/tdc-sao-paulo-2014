package br.com.elo7.templatemethod;

public abstract class Relatorio {
	
	public void imprime(String conteudo) {
		imprimeHeader();
		
		imprimeConteudo(conteudo);
		
		imprimeFooter();
	}

	protected abstract void imprimeConteudo(String conteudo);
	
	private void imprimeHeader() {
		System.out.println("Imprimindo Header do Relatorio");
	}

	private void imprimeFooter() {
		System.out.println("Imprimindo Footer do Relatorio");
	}
	
}
