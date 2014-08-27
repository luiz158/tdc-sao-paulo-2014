package br.com.elo7.producer;

public class MeuLogger {

	private Class<?> classe;

	public MeuLogger(Class<?> classe) {
		this.classe = classe;
	}
	
	public void info(String mensagem) {
		System.out.println("INFO: Class:" + classe.getName());
		System.out.println("INFO: " + mensagem);
	}

}
