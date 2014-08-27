package strategy;

public class TestaStrategy {

	public static void main(String[] args) {
//		String escolhaDoCliente = "parcelado";
		String escolhaDoCliente = "avista";
		
		FaturaPedido faturaPedido = new FaturaPedido();
		if (escolhaDoCliente.equals("parcelado")) {
			faturaPedido.fatura(new FaturarParcelado());
		} else if (escolhaDoCliente.equals("avista")) {
			faturaPedido.fatura(new FaturarAVista());
		}
	}
	
}
