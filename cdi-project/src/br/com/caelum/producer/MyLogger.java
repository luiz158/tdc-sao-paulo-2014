package br.com.caelum.producer;

public class MyLogger {

	private Class<? extends Object> clazz;

	public MyLogger(Class<? extends Object> clazz) {
		this.clazz = clazz;
	}

	public void info(String message) {
		System.out.println("LOG CLASS: " + clazz.getName());
		System.out.println("LOG INFO: " + message);
	}

}
