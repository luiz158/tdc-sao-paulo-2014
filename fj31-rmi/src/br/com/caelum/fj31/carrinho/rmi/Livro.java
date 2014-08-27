package br.com.caelum.fj31.carrinho.rmi;

import java.io.Serializable;

public class Livro implements Serializable {

	private static final long serialVersionUID = 1L; //A partir do Java 5 o compilador gera um Warning

	private Long id;

	private String nome;

	private String isbn;
	
	private transient String editora; //Usamos transient quando nao queremos que um atributo seja serializado 

	private double preco;

	public Livro() {
	}

	public Livro(Long id, String nome, String isbn, String editora) {
		this.id = id;
		this.nome = nome;
		this.isbn = isbn;
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + ", Nome: " + this.nome + ", ISBN: " + this.isbn + ", Editora: " + this.editora;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
