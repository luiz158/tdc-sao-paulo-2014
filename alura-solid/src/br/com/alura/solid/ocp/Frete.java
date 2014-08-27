package br.com.alura.solid.ocp;

public class Frete implements ServicoDeEntrega {

	public Double para(String cidade) {
		return 10.0;
	}

}
