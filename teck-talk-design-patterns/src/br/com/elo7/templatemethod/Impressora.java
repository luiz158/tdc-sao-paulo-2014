package br.com.elo7.templatemethod;

public class Impressora {

	private Relatorio relatorio;

	public Impressora(Relatorio relatorio) {
		this.relatorio = relatorio;
	}

	public void imprime(String conteudo) {
		relatorio.imprime(conteudo);
	}

}
