package br.com.caelum.acumulador;

import br.com.caelum.modelo.Analista;
import br.com.caelum.modelo.Engenheiro;
import br.com.caelum.modelo.Gerente;

public class TestaAcumulador {

	public static void main(String[] args) {
		Gerente jose = new Gerente();
		jose.setNome("José");
		jose.setSalario(1000);
		
		Analista gustavo = new Analista();
		gustavo.setNome("Gustavo");
		gustavo.setSalario(2000);
		
		Engenheiro alexandre = new Engenheiro();
		alexandre.setNome("Alexandre");
		alexandre.setSalario(1000);
		
		AcumuladorDeBonus acumulador = new AcumuladorDeBonus();
		acumulador.acumula(jose);
		acumulador.acumula(gustavo);
		acumulador.acumula(alexandre);
		
		System.out.println(acumulador.getTotal());
	}
	
}
