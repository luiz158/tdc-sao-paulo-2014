package br.com.caelum.modelo;

public class Engenheiro extends Funcionario {

	@Override
	public double getBonus() {
		return 2000;
	}

	@Override
	public boolean autentica(int tentativa) {
		// TODO Auto-generated method stub
		return false;
	}
}
