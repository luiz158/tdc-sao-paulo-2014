package br.com.alura.solid.encapsulamento;

public class Pagamento {

	private Double valor;
	
	private MeiosDePagamento boleto;

	public Pagamento(Double valor, MeiosDePagamento boleto) {
		this.valor = valor;
		this.boleto = boleto;
	}

	public Double getValor() {
		return valor;
	}
	
	public MeiosDePagamento getBoleto() {
		return boleto;
	}
	
}
