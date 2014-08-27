package br.com.caelum.vraptor.model;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class UsuarioLogado {

	private Usuario usuario;
	
	public void loga(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void desloga() {
		this.usuario = new Usuario();
	}
	
	public boolean estaLogado() {
		return this.usuario != null;
	}
	
}
