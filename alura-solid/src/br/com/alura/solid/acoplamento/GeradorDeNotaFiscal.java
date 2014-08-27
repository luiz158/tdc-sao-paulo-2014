package br.com.alura.solid.acoplamento;

import java.util.List;

public class GeradorDeNotaFiscal {

	private List<AcaoAposGerarNota> acoes;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}

	public void gera(NotaFiscal notaFiscal) {
		Double calculoFinal = calculaValorFinalDoImpostoDo(notaFiscal.getValor());
		
		System.out.println("Valor calculador: " + calculoFinal);
		
		for (AcaoAposGerarNota acao : acoes) {
			acao.executa(notaFiscal);
		}
	}

	private Double calculaValorFinalDoImpostoDo(Double valor) {
		return valor * 1.8;
	}

}
