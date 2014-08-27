package br.com.caelum.generic;

public class Dao<T> {

	public void save(T t) {
		System.out.println("Saved: " + t);
	}
}
