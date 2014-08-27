package br.com.caelum.fj31.singleton.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RegistraCalculadoraSingleton {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		LocateRegistry.createRegistry(1099);
		
		Naming.rebind("/loja/singleton", new CalculadoraSingletonBean());
		
		System.out.println("Calculadora registrada");
	}
	
}
