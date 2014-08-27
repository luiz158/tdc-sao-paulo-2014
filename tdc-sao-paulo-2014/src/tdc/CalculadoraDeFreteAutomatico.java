package tdc;


@FreteAutomatico
public class CalculadoraDeFreteAutomatico implements CalculadoraDeFrete {

	public CalculadoraDeFreteAutomatico() {
		System.out.println("Frete Automatico Criado");
	}
	
	public Double calcula(Double valorTotal) {
		System.out.println("Calculo Automatico Sincrono");
		return valorTotal * 0.10;
	}

}
