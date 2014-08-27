package br.com.alura.solid.encapsulamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {

	private List<Pagamento> pagamentos = new ArrayList<>();
	
	private double valor;

	private boolean pago;
	
	public Fatura() {
		this.pago = false;
	}
	
	public List<Pagamento> getPagamentos() {
		return Collections.unmodifiableList(this.pagamentos);
	}

	public double getValorTotal() {
		return this.valor;
	}

	public void setPago(boolean trago) {
		this.pago = trago;
	}
	
	public boolean isPago() {
		return pago;
	}

	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		if (valorTotalDosPagamentos() >= this.valor) {
			this.pago = true;
		}
	}

	private double valorTotalDosPagamentos() {
		double total = 0;
		for(Pagamento pagamento: pagamentos) {
			total =+ pagamento.getValor();
		}
		return total;
	}

}
