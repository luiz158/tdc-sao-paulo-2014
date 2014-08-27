package br.com.caelum.simulador;

import java.util.List;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.interceptor.Interceptor;

import br.com.caelum.calculadora.CalculadoraFolhaPagamento;
import br.com.caelum.modelo.Folha;
import br.com.caelum.modelo.Funcionario;
import br.com.caelum.qualifiers.PlanoDeCargos;
import br.com.caelum.qualifiers.Simulador;

@Simulador(planoDeCargos = PlanoDeCargos.VERSAO_2013)
@Alternative
@Priority(Interceptor.Priority.APPLICATION + 1)
public class SimuladoraCalculoFolhaPagamento2013 implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Simulando Folha de Pagamento Versao 2013");
		return new Folha();
	}

}
