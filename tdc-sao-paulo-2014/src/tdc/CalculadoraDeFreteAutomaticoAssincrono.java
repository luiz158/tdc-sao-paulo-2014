package tdc;

public class CalculadoraDeFreteAutomaticoAssincrono extends CalculadoraDeFreteAutomatico {

	public Double calcula(Double valorTotal) {
		System.out.println("Calculo Automatico Assincrono");
		return valorTotal * 0.10;
	}

}
