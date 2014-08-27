package br.com.caelum.modelo;

public class Gerente extends Funcionario {

	private int senha = 12345;
	
	@Override
	public double getBonus() {
		return this.getSalario() * 1.20;
	}
	
	public boolean autentica(int tentativa) {
		return this.senha == tentativa;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
