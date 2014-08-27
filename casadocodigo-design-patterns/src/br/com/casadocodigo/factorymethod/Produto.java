package br.com.casadocodigo.factorymethod;

public class Produto {

	private Long id;
	
	private Double preco;

	public Produto(Long id, Double preco) {
		this.id = id;
		this.preco = preco;
	}
	
	public Long getId() {
		return id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
