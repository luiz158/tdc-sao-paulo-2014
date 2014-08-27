package br.com.elo7.pattern;

public class PagamentoViaMoip implements RegraDePagamento {

	private Jaiminho jaiminho;

	public PagamentoViaMoip(Jaiminho jaiminho) {
		this.jaiminho = jaiminho;
	}

	public void paga() {
		System.out.println("Conecta no Moip");
		System.out.println("Dados do usuario no Moip");
		System.out.println("Faz pagamento no Moip");		
	}

}
