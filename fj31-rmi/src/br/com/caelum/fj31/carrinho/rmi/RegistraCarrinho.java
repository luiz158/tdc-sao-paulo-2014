package br.com.caelum.fj31.carrinho.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RegistraCarrinho {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		//Se quisermos usar uma porta que ja esta sendo usada: Port already in use
		LocateRegistry.createRegistry(1097);
		
		Naming.rebind("loja/carrinhos", new CarrinhoBean()); //Sacada do dicionario
		
		System.out.println("Carrinho registrado!");
	}
	
}
