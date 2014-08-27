package br.com.casadocodigo.composicao2;

public class Criptografador implements PosProcessamento {

	//Open Close Principle
	@Override
	public void processa() {
		System.out.println("Criptografando arquivo..");
	}

}
