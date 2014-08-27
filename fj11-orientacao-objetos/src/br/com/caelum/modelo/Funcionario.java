package br.com.caelum.modelo;

public abstract class Funcionario {

	private String nome;

	private double salario;
	
	public abstract boolean autentica(int tentativa);
	
	public abstract double getBonus();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
