package br.com.caelum.producer;

public class MyLoggerFactory {

	public static MyLogger get(Class<? extends Object> clazz) {
		return new MyLogger(clazz);
	}

}
