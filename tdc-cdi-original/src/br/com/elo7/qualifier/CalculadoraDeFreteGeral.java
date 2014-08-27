package br.com.elo7.qualifier;

import javax.enterprise.inject.Alternative;

@Frete(tipo = TipoFrete.AUTOMATICO)
@Alternative
public class CalculadoraDeFreteGeral implements CalculadoraDeFrete {

	@Override
	public Double calcula(Double valor) {
		return valor * 0.9;
	}

}
