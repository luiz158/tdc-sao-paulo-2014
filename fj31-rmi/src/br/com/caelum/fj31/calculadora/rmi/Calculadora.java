package br.com.caelum.fj31.calculadora.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {

	double soma(double valorA, double valorB) throws RemoteException; //RemoteException obrigatoria
	
}
