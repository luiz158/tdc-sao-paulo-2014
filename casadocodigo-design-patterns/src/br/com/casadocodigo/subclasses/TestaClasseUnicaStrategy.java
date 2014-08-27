package br.com.casadocodigo.subclasses;

public class TestaClasseUnicaStrategy {

	public static void main(String[] args) {
		String valor = "Valor2";
		ClasseUnicaStrategy classeUnica = null;
		if (valor.equals("Valor1")) {
			classeUnica = new ClasseUnicaStrategy(new ImpressaoAbobrinha());
		}
		else if (valor.equals("Valor2")) {
			classeUnica = new ClasseUnicaStrategy(new ImpressaoTomate());
		}
		else if (valor.equals("Valor3")) {
			classeUnica = new ClasseUnicaStrategy(new ImpressaoCenoura());
		}
		classeUnica.metodoPrincipal();
	}
	
}
