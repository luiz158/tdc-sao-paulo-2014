package br.com.caelum.livraria.cliente;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.livraria.ejb.Carrinho;
import br.com.caelum.livraria.modelo.Livro;

public class ClienteCarrinhoLivraria {

	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		Carrinho carrinho = (Carrinho) ic.lookup("ejb:/livraria/CarrinhoBean!br.com.caelum.livraria.ejb.Carrinho?stateful");
		
		Livro refactoring = new Livro();
		refactoring.setNome("Refactoring");
		refactoring.setEditora("Saraiva");
		refactoring.setId(12l);
		refactoring.setIsbn("12345456");
		refactoring.setPreco(95);
		
		carrinho.adicionaLivro(refactoring);
		
		System.out.println(carrinho.getTotal());
		
		carrinho.finalizaCompra();
	}
	
}
