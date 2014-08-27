package br.com.caelum.fj31.calculadora.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RegistaCalculadora {

	//Teremos que lancar RemoteException e MalformedURLException
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		LocateRegistry.createRegistry(1099);
		
		Naming.rebind("/loja/calculadora", new CalculadoraBean());
		
		System.out.println("Calculadora registrada");
	}
	
}
