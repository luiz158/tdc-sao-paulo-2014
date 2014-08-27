package br.com.caelum.calculadora;

import java.util.List;

import br.com.caelum.modelo.Folha;
import br.com.caelum.modelo.Funcionario;

public interface CalculadoraFolhaPagamento {

	Folha calculaFolha(List<Funcionario> funcionarios);
	
}
