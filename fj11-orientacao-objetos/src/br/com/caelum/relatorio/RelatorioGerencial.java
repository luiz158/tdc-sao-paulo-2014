package br.com.caelum.relatorio;

import br.com.caelum.modelo.Analista;
import br.com.caelum.modelo.Gerente;

public class RelatorioGerencial {

	public static void main(String[] args) {
		Gerente maria = new Gerente();
		maria.setSenha(12345);
		
		GerenciadorDeUsuarios gerenciador = new GerenciadorDeUsuarios();
		gerenciador.fazLogin(maria);
		
		Analista joao = new Analista();
		gerenciador.fazLogin(joao);
	}
}
