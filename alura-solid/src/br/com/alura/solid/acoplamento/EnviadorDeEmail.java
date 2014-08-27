package br.com.alura.solid.acoplamento;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando por email a nota fiscal");
	}

}
