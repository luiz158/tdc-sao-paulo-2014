package br.com.caelum.observerqualificador;

import java.lang.annotation.Annotation;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class GerenciadorDeEmpregados {

	private TipoDesligamento tipoDemissao = TipoDesligamento.JUSTA_CAUSA;
	
	@Inject @Admissao
	private Event<Empregado> admissaoEmpregado;
	
	@Inject
	private Event<Empregado> desligamentoEvent;
	
	public void cadastra(Empregado empregado) {
		admissaoEmpregado.fire(empregado);
	}
	
	public void demite(Empregado empregado) {
		Annotation annotation = null;
		if (tipoDemissao.equals(TipoDesligamento.APOSENTADORIA)) {
			annotation = new DesligamentoQualifier(TipoDesligamento.APOSENTADORIA);
		} else if (tipoDemissao.equals(TipoDesligamento.DEMISSAO)) {
			annotation = new DesligamentoQualifier(TipoDesligamento.DEMISSAO);
		} else if (tipoDemissao.equals(TipoDesligamento.JUSTA_CAUSA)) {
			annotation = new DesligamentoQualifier(TipoDesligamento.JUSTA_CAUSA);
		}
		Event<Empregado> event = desligamentoEvent.select(annotation);
		event.fire(empregado);
	}

}
