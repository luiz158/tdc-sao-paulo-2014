package strategy;

public class FaturaPedido {

	public void fatura(FaturarService faturar) {
		faturar.processar(new PedidoVenda());
	}

}
