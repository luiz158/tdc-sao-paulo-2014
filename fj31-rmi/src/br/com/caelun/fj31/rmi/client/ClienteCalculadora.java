package br.com.caelun.fj31.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.caelum.fj31.calculadora.rmi.Calculadora;

public class ClienteCalculadora {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		//Lembrar que teremos um Connection Refused caso nao tenhamos registrado a CalculadoraBean
		Calculadora calculadora = (Calculadora) Naming.lookup("/loja/calculadora"); 

		double soma = calculadora.soma(5, 3);
		
		System.out.println("Soma: " + soma);
	}
	
}
