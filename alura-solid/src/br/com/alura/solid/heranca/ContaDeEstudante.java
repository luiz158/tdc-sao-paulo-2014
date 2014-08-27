package br.com.alura.solid.heranca;

public class ContaDeEstudante implements Conta {

	private ManipuladorDeSaldo manipulador;
	
	public ContaDeEstudante(Double saldo) {
		this.manipulador = new ManipuladorDeSaldo(saldo);
	}

	@Override
	public void deposita(Double valor) {
		this.manipulador.deposita(valor * 0.001);
	}

	@Override
	public void rende() {
		this.manipulador.rende(2.5);
	}

	@Override
	public Double getSaldo() {
		return manipulador.getSaldo();
	}
	
}
