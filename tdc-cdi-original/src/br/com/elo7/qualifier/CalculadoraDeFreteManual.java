package br.com.elo7.qualifier;

//@FreteManual
@Frete(tipo = TipoFrete.MANUAL)
public class CalculadoraDeFreteManual implements CalculadoraDeFrete {

	@Override
	public Double calcula(Double valor) {
		return valor * 0.01;
	}

}
