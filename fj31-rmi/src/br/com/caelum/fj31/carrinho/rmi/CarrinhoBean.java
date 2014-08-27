package br.com.caelum.fj31.carrinho.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean extends UnicastRemoteObject implements Carrinho {
	
	private static final long serialVersionUID = 1L;

	private double total;
	
	private List<Livro> livros = new ArrayList<>();
	
	public CarrinhoBean() throws RemoteException {
		super();
	}

	@Override
	public void adicionaLivro(Livro livro) throws RemoteException {
		livros.add(livro);
		total += livro.getPreco();
		
		System.out.printf("Livro %s adicionado com sucesso!", livro.getNome());
	}

	@Override
	public List<Livro> getLivros() throws RemoteException {
		return this.livros;
	}

	@Override
	public double getTotal() throws RemoteException {
		return this.total;
	}

}
