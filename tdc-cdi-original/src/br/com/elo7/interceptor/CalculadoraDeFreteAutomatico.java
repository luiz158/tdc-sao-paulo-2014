package br.com.elo7.interceptor;


@Frete
public class CalculadoraDeFreteAutomatico implements CalculadoraDeFrete {

//	@Inject
//	private MeuLogger logger;
	
	@Override @Logger
	public Double calcula(Double valor) {
		System.out.println("Calculando Sincronamente");
//		logger.info("Calculando frete automatico");
		return valor * 0.9;
	}
	
}
