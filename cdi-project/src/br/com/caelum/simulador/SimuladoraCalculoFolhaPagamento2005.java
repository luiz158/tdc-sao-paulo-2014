package br.com.caelum.simulador;

import java.util.List;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.interceptor.Interceptor;

import br.com.caelum.calculadora.CalculadoraFolhaPagamento;
import br.com.caelum.modelo.Folha;
import br.com.caelum.modelo.Funcionario;
import br.com.caelum.qualifiers.Simulador;

@Simulador
@Alternative
@Priority(Interceptor.Priority.APPLICATION)
public class SimuladoraCalculoFolhaPagamento2005 implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Simulando a Folha de Pagamento");
		return new Folha();
	}

}
