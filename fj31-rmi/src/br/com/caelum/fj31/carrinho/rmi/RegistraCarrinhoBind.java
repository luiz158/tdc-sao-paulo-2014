package br.com.caelum.fj31.carrinho.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RegistraCarrinhoBind {

	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		//Se quisermos usar uma porta que ja esta sendo usada: Port already in use
		LocateRegistry.createRegistry(1099);
		
		Naming.bind("loja/carrinho", new CarrinhoBean()); //Sacada do dicionario
		
		System.out.println("Carrinho registrado!");
	}
	
}
