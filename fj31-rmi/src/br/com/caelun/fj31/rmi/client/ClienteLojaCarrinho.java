package br.com.caelun.fj31.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.caelum.fj31.carrinho.rmi.Carrinho;
import br.com.caelum.fj31.carrinho.rmi.Livro;

public class ClienteLojaCarrinho {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		Carrinho carrinho = (Carrinho) Naming.lookup("rmi://localhost:1099/loja/carrinhos"); //MalformedURLException
		
		Livro effectiveJava = new Livro();
		effectiveJava.setNome("Effective Java");
		effectiveJava.setPreco(90);
		carrinho.adicionaLivro(effectiveJava);
		
		Livro refactoring = new Livro();
		refactoring.setNome("Refactoring");
		refactoring.setPreco(85);
		carrinho.adicionaLivro(refactoring);
		
		double total = carrinho.getTotal();
		System.out.println("Valor total: " + total);
	}
	
}
