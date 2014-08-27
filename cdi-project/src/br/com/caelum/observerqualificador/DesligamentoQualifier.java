package br.com.caelum.observerqualificador;

import javax.enterprise.util.AnnotationLiteral;

public class DesligamentoQualifier extends AnnotationLiteral<Desligamento> implements Desligamento {

	private static final long serialVersionUID = 5955547376141398459L;
	
	private TipoDesligamento tipoDesligamento;

	public DesligamentoQualifier(TipoDesligamento tipoDesligamento) {
		this.tipoDesligamento = tipoDesligamento;
	}
	
	@Override
	public TipoDesligamento tipoDesligamento() {
		return this.tipoDesligamento;
	}

}
