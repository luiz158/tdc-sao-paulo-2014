package tdc;

public class MeuLogger {
	
	private Class<?> class1;

	public MeuLogger(Class<?> class1) {
		this.class1 = class1;
	}
	
	public void info(String mensagem) {
		System.out.println("::CLASS::" + class1.getName());
		System.out.println(mensagem);
	}

}
