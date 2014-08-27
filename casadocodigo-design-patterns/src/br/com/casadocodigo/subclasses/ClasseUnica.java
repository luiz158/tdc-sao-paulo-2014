package br.com.casadocodigo.subclasses;

public abstract class ClasseUnica {

	//Template Method
	public void metodoPrincipal(String valor) {
		if (valor.equals("Valor1")) {
			metodoAbobrinha();
		} else if (valor.equals("Valor2")) {
			metodoCenoura();
		} else if (valor.equals("Valor3")) {
			metodoTomate();
		}
	}

	public abstract void metodoTomate();

	public abstract void metodoCenoura();

	public abstract void metodoAbobrinha();
	
}
