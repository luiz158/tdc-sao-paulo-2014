package br.com.caelum.vraptor.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
	
	public EntityManager criaEntityManager() {
		return factory.createEntityManager();
	}
	
}
