package br.com.caelum.modelo;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.interceptor.Interceptor;

@Alternative
@Priority(Interceptor.Priority.APPLICATION)
public class CalculadoraDeSalarios2013 implements CalculadoraDeSalarios {

	@Override
	public Double calculaSalario(Funcionario funcionario) {
		return 100.0;
	}

}
