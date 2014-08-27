package br.com.caelum.fj31.calculadora.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraBean extends UnicastRemoteObject implements Calculadora {
	
	private static final long serialVersionUID = -5506225269357049670L;

	//O Construtor eh obrigatorio e temos que dar um throws RemoteException
	protected CalculadoraBean() throws RemoteException {
		super();
	}

	@Override
	public double soma(double valorA, double valorB) throws RemoteException {
		return valorA + valorB;
	}

}
