package strategy;

public class FaturarAVista implements FaturarService {

	@Override
	public void processar(PedidoVenda pedidoVenda) {
		atribuiDesconto();
		pedidoVenda.fatura();
		enviaEmail();
	}

	private void enviaEmail() {
	}

	private void atribuiDesconto() {
	}

}
