package br.com.alura.solid.srp;

public class TrintaPorCentoAoAno implements RegraDeCalculo {

	public Double calcula(Funcionario funcionario) {
		return funcionario.getSalario() * 3.0;
	}

}
