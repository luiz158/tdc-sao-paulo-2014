package br.com.elo7.lazyselect;

@Frete
public class CalculadoraDeFreteAutomatico implements CalculadoraDeFrete {

	@Override
	public Double calcula(Double valor) {
		System.out.println("Calculando Sincronamente");
		return valor * 0.9;
	}
	
}
