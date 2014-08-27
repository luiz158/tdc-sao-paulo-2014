package br.com.caelum.vraptor.observers;

import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.dao.ProdutoDao;
import br.com.caelum.vraptor.dao.UsuarioDao;
import br.com.caelum.vraptor.events.VRaptorInitialized;
import br.com.caelum.vraptor.model.Produto;
import br.com.caelum.vraptor.model.Usuario;
import br.com.caelum.vraptor.util.EntityManagerFactoryProducer;
import br.com.caelum.vraptor.util.EntityManagerProducer;
import br.com.caelum.vraptor.util.JPAUtil;

public class InitialDataObserver {

	/**
	 * Esse ?????? um exemplo simples de observer do CDI com VRaptor 4
	 * 
	 * Ele ?????? utilizado para inserir um usu??????rio e alguns produtos
	 * sempre que a app ?????? startada, pois estamos usando um banco
	 * em mem??????ria. Voc?????? pode ler mais a respeito de observers em:
	 *  
	 * http://www.vraptor.org/pt/docs/eventos/
	 */
	public void insert(@Observes VRaptorInitialized event) {
		
		EntityManager em = new JPAUtil().criaEntityManager();
		em.getTransaction().begin();
		
		UsuarioDao usuarioDao = new UsuarioDao(em);
		usuarioDao.salva(new Usuario("vraptor", "vraptor"));
		
		ProdutoDao produtoDao = new ProdutoDao(em);
		produtoDao.adiciona(new Produto("DVD/Blu-ray Justin Bieber", 120.8, 2));
		produtoDao.adiciona(new Produto("Carro de F1", 1.99, 5));
		produtoDao.adiciona(new Produto("Livro da Casa do C??????digo", 29.9, 10));
		
		em.getTransaction().commit();
		em.close();
	}	
}