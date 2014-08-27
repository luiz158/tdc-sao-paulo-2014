package br.com.casadocodigo.composicao2;

public class NullProcessador implements PosProcessamento {

	@Override
	public void processa() {
		System.out.println("Processamento Defaulf"); //Null Object
	}

}
