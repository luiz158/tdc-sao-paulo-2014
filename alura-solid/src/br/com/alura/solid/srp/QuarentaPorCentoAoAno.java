package br.com.alura.solid.srp;

public class QuarentaPorCentoAoAno implements RegraDeCalculo {

	public Double calcula(Funcionario funcionario) {
		return funcionario.getSalario() * 4.0;
	}

}
