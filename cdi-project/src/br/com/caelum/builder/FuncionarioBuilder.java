package br.com.caelum.builder;

import br.com.caelum.modelo.Cargo;
import br.com.caelum.modelo.Funcionario;

public class FuncionarioBuilder {

	private Funcionario funcionario;
	
	public FuncionarioBuilder() {
		this.funcionario = new Funcionario();
	}
	
	public FuncionarioBuilder comSalarioBaseDe(Double salarioBase) {
		this.funcionario.setSalarioBase(salarioBase);
		return this;
	}
	
	public FuncionarioBuilder comCargoDe(Cargo cargo) {
		this.funcionario.setCargo(cargo);
		return this;
	}

	public Funcionario build() {
		return this.funcionario;
	}

}
