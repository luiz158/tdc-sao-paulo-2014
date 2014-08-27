package br.com.casadocodigo.subclasses;

public class SubclasseB extends ClasseUnica {

	@Override
	public void metodoPrincipal(String valor) {
		super.metodoPrincipal(valor);
	}
	
	@Override
	public void metodoAbobrinha() {
		System.out.println("Subclasse B");
		System.out.println("Abobrinha A");
		System.out.println("Abobrinha B");
		System.out.println("Abobrinha C");
	}

	@Override
	public void metodoCenoura() {
		System.out.println("Subclasse B");
		System.out.println("Cenoura A");
		System.out.println("Cenoura B");
	}

	@Override
	public void metodoTomate() {
		System.out.println("Subclasse B");
		System.out.println("Tomate A");
		System.out.println("Tomate B");
	}
	
}
