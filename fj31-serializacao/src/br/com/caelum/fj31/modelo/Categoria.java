package br.com.caelum.fj31.modelo;

import java.io.Serializable;

public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;

	private Video video;

	public Categoria(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Categoria [nome=" + nome + ", video=" + video + "]";
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}
