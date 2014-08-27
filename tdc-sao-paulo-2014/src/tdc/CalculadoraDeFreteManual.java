package tdc;

@FreteManual
public class CalculadoraDeFreteManual implements CalculadoraDeFrete {

	@Override
	public Double calcula(Double valorTotal) {
		System.out.println("Calculo Manual");
		return valorTotal * 0.20;
	}

}
