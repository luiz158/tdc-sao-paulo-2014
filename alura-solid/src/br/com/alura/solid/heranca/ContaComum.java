package br.com.alura.solid.heranca;

public class ContaComum implements Conta {

	private ManipuladorDeSaldo manipulador;
	
	public ContaComum(Double saldo) {
		this.manipulador = new ManipuladorDeSaldo(saldo);
	}
	
	public void deposita(Double valor) {
		manipulador.deposita(valor);
	}
	
	public void rende() {
		manipulador.rende(1.9);
	}
	
	public Double getSaldo() {
		return manipulador.getSaldo();
	}
	
}
