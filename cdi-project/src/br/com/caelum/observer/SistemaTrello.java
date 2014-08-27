package br.com.caelum.observer;

import javax.enterprise.event.Observes;

public class SistemaTrello implements SistemaFuncionario {

	@Override
	public void cadastraFuncionario(@Observes Funcionario funcionario) {
		System.out.println("Cadastrando no sistema Trello");
	}

}
