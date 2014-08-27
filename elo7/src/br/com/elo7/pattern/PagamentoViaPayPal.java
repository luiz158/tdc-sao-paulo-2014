package br.com.elo7.pattern;

public class PagamentoViaPayPal implements RegraDePagamento {

	public void paga() {
		System.out.println("Conecta no PayPal");
		System.out.println("Dados do usuario no PayPal");
		System.out.println("Faz pagamento no PayPal");		
	}

}
