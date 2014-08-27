package br.com.caelum.calculadora;

import java.util.List;

import javax.enterprise.inject.Alternative;

import br.com.caelum.modelo.Folha;
import br.com.caelum.modelo.Funcionario;

@Alternative
public class SimuladorCalculoAlternativo implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Simulando Folha de Pagamento Alternativa");
		return new Folha();
	}

}
