package br.com.caelum.relatorio;

import br.com.caelum.modelo.Funcionario;

public class GerenciadorDeUsuarios {

	public void fazLogin(Funcionario funcionario) {
		int tentativa = 12345; //pegamos do teclado
		if (funcionario.autentica(tentativa)) {
			//coloca o usuario na sessao
		}
	}
	
}
