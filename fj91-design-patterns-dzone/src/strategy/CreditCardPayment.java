package strategy;

public class CreditCardPayment implements PaymentStrategy {

	private String number;

	public CreditCardPayment(String number) {
		this.number = number;
	}

	@Override
	public void pay(Double totalValue) {
		System.out.printf("Payment with CreditCard. Number: %s, Total: %f", number, totalValue);
	}

}
