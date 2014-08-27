package br.com.caelum.modelo;

public class Analista extends Funcionario {

	private int senha = 54321;
	
	@Override
	public double getBonus() {
		return 0;
	}
	
	public boolean autentica(int tentativa) {
		return false;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
