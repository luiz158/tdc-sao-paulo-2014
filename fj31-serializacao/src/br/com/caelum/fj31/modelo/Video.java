package br.com.caelum.fj31.modelo;

import java.io.Serializable;

public class Video implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;

	public Video(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Video [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

}
