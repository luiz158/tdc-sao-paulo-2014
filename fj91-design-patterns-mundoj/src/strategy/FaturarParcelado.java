package strategy;

public class FaturarParcelado implements FaturarService {

	@Override
	public void processar(PedidoVenda pedidoVenda) {
		validaCartao();
		criaParcelas();
		pedidoVenda.fatura();
	}

	private void validaCartao() {
		
	}
	
	private void criaParcelas() {
		
	}

}
