package br.com.alura.solid.ocp;

public class TabelaDePrecoPadrao implements TabelaDePreco {

	public Double calcula(Double valor) {
		return valor * 1.9;
	}

}
