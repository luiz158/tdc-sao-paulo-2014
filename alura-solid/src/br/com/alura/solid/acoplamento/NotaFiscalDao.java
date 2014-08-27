package br.com.alura.solid.acoplamento;

public class NotaFiscalDao implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvando a nota fiscal");
	}

}
