package br.com.alura.solid.acoplamento;

import java.util.Arrays;
import java.util.List;

public class TestaGeradorDeNotaFiscal {

	public static void main(String[] args) {
		List<AcaoAposGerarNota> acoes = Arrays.asList(new EnviadorDeEmail(), new NotaFiscalDao());
		
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(acoes);
		gerador.gera(new NotaFiscal(1000.0));
	}
	
}
