package br.com.caelum.fj31.singleton.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraSingletonBean extends UnicastRemoteObject implements CalculadoraSingleton {

	private static final long serialVersionUID = 2052756645807430112L;

	private static int valor = 1;
	
	protected CalculadoraSingletonBean() throws RemoteException {
		super();
	}

	@Override
	public int calcula() throws RemoteException {
		return ++valor;
	}

}
