package br.com.caelum.fj31.singleton.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraSingleton extends Remote {

	int calcula() throws RemoteException;
	
}
