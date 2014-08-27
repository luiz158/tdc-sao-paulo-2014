package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.annotation.Public;
import br.com.caelum.vraptor.dao.UsuarioDao;
import br.com.caelum.vraptor.model.Usuario;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class LoginController {

	private UsuarioDao usuarios;
	
	private Result result;
	
	private Validator validator;

	@Inject
	public LoginController(UsuarioDao usuarios, Result result, Validator validator) {
		this.usuarios = usuarios;
		this.result = result;
		this.validator = validator;
	}

	@Deprecated //CDI eyes only
	public LoginController() {
	}
	
	@Get
	public void formulario() {
	}
	
	@Post
	@Public
	public void autentica(Usuario usuario) {
		if (!usuarios.existe(usuario)) {
			validator.add(new I18nMessage("login", "login.invalido"));
			validator.onErrorUsePageOf(this).formulario();
		}
		result.redirectTo(ProdutoController.class).lista();
	}
	
}
