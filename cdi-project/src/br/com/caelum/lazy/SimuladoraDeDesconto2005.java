package br.com.caelum.lazy;

@SimuladorDesconto
public class SimuladoraDeDesconto2005 implements SimuladorDeDesconto {

	@Override
	public Double calcula() {
		System.out.println("Simulando desconto com 2005");
		return 90.0;
	}

}
