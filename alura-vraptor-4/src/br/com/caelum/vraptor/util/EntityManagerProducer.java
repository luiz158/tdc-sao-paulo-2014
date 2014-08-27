package br.com.caelum.vraptor.util;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;

public class EntityManagerProducer {

	@Produces @RequestScoped
	public EntityManager criaEntityManager() {
		return new JPAUtil().criaEntityManager();
	}

	public void close(@Disposes EntityManager manager) {
		manager.close();
	}
	
}
