package br.com.caelum.vraptor.interceptor;

import javax.inject.Inject;

import br.com.caelum.vraptor.Accepts;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.annotation.Public;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.controller.LoginController;
import br.com.caelum.vraptor.model.UsuarioLogado;

@Intercepts
public class AutorizadorInterceptor {

	private UsuarioLogado usuarioLogado;
	
	private Result result;

	private ControllerMethod method;
	
	@Inject
	public AutorizadorInterceptor(UsuarioLogado usuarioLogado, Result result, ControllerMethod method) {
		this.usuarioLogado = usuarioLogado;
		this.result = result;
		this.method = method;
	}
	
	@Accepts
	public boolean accepts() {
		return !method.containsAnnotation(Public.class);
	}
	
	@AroundCall
	public void intercepta(SimpleInterceptorStack stack) {
		if (!usuarioLogado.estaLogado()) {
			result.redirectTo(LoginController.class).formulario();
			return;
		}
		stack.next();
	}
}
