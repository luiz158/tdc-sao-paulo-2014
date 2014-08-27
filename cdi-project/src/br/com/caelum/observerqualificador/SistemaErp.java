package br.com.caelum.observerqualificador;

import javax.enterprise.event.Observes;

public class SistemaErp {

	public void cadastraEmpregado(@Observes @Admissao Empregado empregado) {
		System.out.println("Cadastrando empregago no ERP");
	}
	
	public void removeEmpregado(@Observes @Demissao Empregado empregado) {
		System.out.println("Removendo empregago no ERP");
	}
	
	public void removeEmpregadoAposentadoria(@Observes @Aposentadoria Empregado empregado) {
		System.out.println("Removendo empregado no ERP por APOSENTADORIA");
	}
	
	public void removeEmpregadoJustaCausa(@Observes @Desligamento(tipoDesligamento = TipoDesligamento.JUSTA_CAUSA) Empregado empregado) {
		System.out.println("Removendo empregado no ERP por JUSTA CAUSA");
	}
	
}
