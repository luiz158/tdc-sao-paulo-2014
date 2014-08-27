package br.com.alura.solid.srp;

public class QuinzePorCentoAoAno implements RegraDeCalculo {

	public Double calcula(Funcionario funcionario) {
		return funcionario.getSalario() * 1.5;
	}

}
