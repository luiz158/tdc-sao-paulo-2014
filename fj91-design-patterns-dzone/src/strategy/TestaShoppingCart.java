package strategy;

public class TestaShoppingCart {

	public static void main(String[] args) {
		String paymentType = "Billet"; //cliente escolhe
		ShoppingCart shoppingCart = new ShoppingCart();
		
		shoppingCart.addItem(new Item("iPhone", 2000.0));
		shoppingCart.addItem(new Item("iPad", 1000.0));
		shoppingCart.addItem(new Item("Galaxy", 3000.0));
		
		if (paymentType.equals("PayPal")) {
			shoppingCart.pay(new PaypalPayment("Alexandre Gama", "alexandre.gama.lima@gmail.com"));
		} else if (paymentType.equals("CreditCard")) {
			shoppingCart.pay(new CreditCardPayment("12345"));
		} else if (paymentType.equals("Billet")) {
			shoppingCart.pay(new BilletPayment());
		} else {
			throw new IllegalArgumentException("Method not supported");
		}
	}
	
}
