package br.com.alura.solid.srp;

public enum Cargo {
	ENGENHEIRO(new QuarentaPorCentoAoAno()), 
	CONSULTOR(new QuinzePorCentoAoAno()),
	SECRETARIA(new TrintaPorCentoAoAno());
	
	private RegraDeCalculo regraDeCalculo;
	
	Cargo(RegraDeCalculo regra) {
		this.regraDeCalculo = regra;
	}
	
	public RegraDeCalculo getRegraDeCalculo() {
		return regraDeCalculo;
	}
	
}
