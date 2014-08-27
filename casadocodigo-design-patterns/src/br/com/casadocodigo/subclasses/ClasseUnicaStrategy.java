package br.com.casadocodigo.subclasses;

public class ClasseUnicaStrategy {

	private ImpressaoLegume impressao;

	public ClasseUnicaStrategy(ImpressaoLegume impressao) {
		this.impressao = impressao;
	}

	public void metodoPrincipal() {
		impressao.imprime();
	}
	
}
