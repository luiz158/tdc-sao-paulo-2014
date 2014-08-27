package br.com.caelum.vraptor.interceptor;

import javax.inject.Inject;

import br.com.caelum.vraptor.Accepts;
import br.com.caelum.vraptor.AfterCall;
import br.com.caelum.vraptor.BeforeCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.annotation.Log;
import br.com.caelum.vraptor.controller.ControllerMethod;

@Intercepts
public class LogInterceptor {

	private ControllerMethod method;

	@Inject
	public LogInterceptor(ControllerMethod method) {
		this.method = method;
	}
	
	@Deprecated //CDY eyes only
	public LogInterceptor() {
	}

	@Accepts
	public boolean accepts() {
		return method.containsAnnotation(Log.class);
	}
	
	@BeforeCall
	public void before() {
		System.out.println("Antes da chamada do método");
		String nomeDoMetodo = method.getMethod().getName();
		System.out.println(nomeDoMetodo);
	}

	@AfterCall
	public void after() {
		System.out.println("Depois da chamada do método");
	}
	
}
