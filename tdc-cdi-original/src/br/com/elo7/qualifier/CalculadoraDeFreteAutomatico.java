package br.com.elo7.qualifier;

@Frete(tipo = TipoFrete.AUTOMATICO)
public class CalculadoraDeFreteAutomatico implements CalculadoraDeFrete {

	@Override
	public Double calcula(Double valor) {
		return valor * 0.2;
	}

}
