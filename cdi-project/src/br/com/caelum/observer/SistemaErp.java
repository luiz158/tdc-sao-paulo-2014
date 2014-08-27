package br.com.caelum.observer;

import javax.enterprise.event.Observes;

public class SistemaErp implements SistemaFuncionario {

	@Override
	public void cadastraFuncionario(@Observes Funcionario funcionario) {
		System.out.println("Cadastrando no Sistema ERP");
	}

}
