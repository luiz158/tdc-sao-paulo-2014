package br.com.alura.solid.heranca;

public class ManipuladorDeSaldo {

	private Double saldo;
	
	public ManipuladorDeSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void deposita(Double valor) {
		this.saldo += valor;
	}
	
	public void rende(Double taxa) {
		this.saldo *= taxa;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
}
