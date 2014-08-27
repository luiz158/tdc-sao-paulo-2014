package strategy;

public class PaypalPayment implements PaymentStrategy {

	private String name;
	
	private String email;

	public PaypalPayment(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public void pay(Double totalValue) {
		System.out.printf("Payment with PayPal! Total: %f, Name: %s, Email: %s", totalValue, name, email);
	}

}
