package br.com.caelum.vraptor.interceptor;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.AfterCall;
import br.com.caelum.vraptor.BeforeCall;
import br.com.caelum.vraptor.Intercepts;

@Intercepts(after = {AutorizadorInterceptor.class})
@AcceptsWithAnnotations(value = Transacional.class)
public class ControleDeTransacaoInterceptor {

	private EntityManager manager;

	@Inject
	public ControleDeTransacaoInterceptor(EntityManager manager) {
		this.manager = manager;
	}
	
	@Deprecated //CDI eyes only
	public ControleDeTransacaoInterceptor() {
	}
	
	@BeforeCall
	public void before() {
		manager.getTransaction().begin();
	}

	@AfterCall
	public void after() {
		manager.getTransaction().commit();
	}
	
}
