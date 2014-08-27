package br.com.alura.solid.acoplamento;

public class NotaFiscal {

	private Double valor;

	public NotaFiscal(Double valor) {
		this.valor = valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Double getValor() {
		return this.valor;
	}

}
