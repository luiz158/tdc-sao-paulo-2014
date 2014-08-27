package strategy;

public class BilletPayment implements PaymentStrategy {

	@Override
	public void pay(Double totalValue) {
		System.out.printf("Payment with Billet. Total: %f", totalValue);
	}

}
