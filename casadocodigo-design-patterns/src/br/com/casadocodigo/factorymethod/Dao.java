package br.com.casadocodigo.factorymethod;

public abstract class Dao<T> {

	abstract T buscaPorId(Object id);
	
	abstract void salva(Object object);
	
}
