package br.com.caelum.fj36.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RegistraEstoqueServiceRMI {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		System.setProperty("java.rmi.server.useCodebaseOnly", "false");
		LocateRegistry.createRegistry(1099);
		Naming.rebind("/estoque", new EstoqueService());
		System.out.println("Servico iniciado...");
//		System.setProperty("java.rmi.server.codebase", "false");
		
	}
	
}
