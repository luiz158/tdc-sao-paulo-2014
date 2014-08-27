package br.com.caelum.calculadora;

import java.util.List;

import br.com.caelum.modelo.Folha;
import br.com.caelum.modelo.Funcionario;

public class CalculadoraFolhaPagamentoReal implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Calculando a Folha de Pagamento Real");
		return new Folha();
	}

}
