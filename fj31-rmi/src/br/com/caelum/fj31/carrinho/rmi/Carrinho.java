package br.com.caelum.fj31.carrinho.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Carrinho extends Remote {

	void adicionaLivro(Livro livro) throws RemoteException; //precisamos da RemoteException quando estendemos de Remote
	
	List<Livro> getLivros() throws RemoteException;
	
	double getTotal() throws RemoteException;
	
}
