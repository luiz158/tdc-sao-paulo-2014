package br.com.alura.solid.srp;

public class Funcionario {

	private Long id;
	
	private String nome;

	private Cargo cargo;
	
	private Double salario;
	
	public Funcionario(String nome, Cargo cargo, Double salario) {
		this.nome = nome;
		this.setCargo(cargo);
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Double calculaSalario() {
		return getCargo().getRegraDeCalculo().calcula(this);
	}

	
}
