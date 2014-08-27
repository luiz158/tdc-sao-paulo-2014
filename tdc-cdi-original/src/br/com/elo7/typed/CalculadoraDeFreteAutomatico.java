package br.com.elo7.typed;

//@Typed({CalculadoraDeFreteAutomatico.class}) 
public class CalculadoraDeFreteAutomatico implements CalculadoraDeFrete {

	@Override
	public Double calcula(Double valor) {
		System.out.println("Calculando Sincronamente");
		return valor * 0.9;
	}
	
}
