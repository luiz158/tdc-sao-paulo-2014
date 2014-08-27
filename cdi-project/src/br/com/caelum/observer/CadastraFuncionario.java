package br.com.caelum.observer;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class CadastraFuncionario {

	@Inject
	private Event<Funcionario> eventFuncionario;
	
	public void cadastra(Funcionario funcionario) {
		System.out.println("Cadastrando funcionario");
		
		eventFuncionario.fire(funcionario);
	}

}
