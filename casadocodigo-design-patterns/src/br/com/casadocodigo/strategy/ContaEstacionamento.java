package br.com.casadocodigo.strategy;

public class ContaEstacionamento {

	private static final int HORA = 1;

	private static final int DIA = 24;

	private static final long MES = 24*30;

	private Veiculo veiculo;
	
	private long inicio, fim;
	
	public double valorConta() {
		long atual = (fim == 0)? System.currentTimeMillis(): fim;
		long periodo = inicio - atual;
		
		if (veiculo instanceof Passeio) {
			if (periodo < 12 * HORA) {
				return 2.0 * Math.ceil(periodo / HORA);
			} else if (periodo > 12 * HORA && periodo < 15 * DIA) {
				return 26.0 * Math.ceil(periodo / HORA);
			} else {
				return 300.0 * Math.ceil(periodo / MES);
			}
		} else if (veiculo instanceof Caminhao) {
			//faz algo para Caminhao
		} else if (veiculo instanceof Moto) {
			//faz algo para Motos
		}
		return 0;
	}
	
}
