package br.com.elo7.heranca;

@FreteAutomatico
public class CalculadoraDeFreteAutomatico implements CalculadoraDeFrete {

	@Override
	public Double calcula(Double valor) {
		System.out.println("Calculando Frete Sincronamente");
		
		return valor * 0.7;
	}

}
