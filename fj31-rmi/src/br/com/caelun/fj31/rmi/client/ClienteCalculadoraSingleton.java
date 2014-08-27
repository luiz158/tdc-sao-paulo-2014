package br.com.caelun.fj31.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.caelum.fj31.singleton.rmi.CalculadoraSingleton;

public class ClienteCalculadoraSingleton {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		CalculadoraSingleton calculadora = (CalculadoraSingleton) Naming.lookup("rmi://localhost:1099/loja/singleton");
		
		int valor = calculadora.calcula();
		
		System.out.println("Valor: " + valor);
	}
	
}
