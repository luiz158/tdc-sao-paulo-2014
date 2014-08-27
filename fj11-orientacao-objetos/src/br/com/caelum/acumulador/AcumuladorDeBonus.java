package br.com.caelum.acumulador;

import br.com.caelum.modelo.Funcionario;

public class AcumuladorDeBonus {

	private double total = 0;
	
	public void acumula(Funcionario funcionario) {
		this.total += funcionario.getBonus();
	}

	public double getTotal() {
		return total;
	}
	
}
