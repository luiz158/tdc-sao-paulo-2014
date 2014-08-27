package visitor;

public class TestVisitor {

	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		
		shoppingCart.addItem(new Book("Refactoring", 90.0));
		shoppingCart.addItem(new Dvd("The Calling", 13.0));
	}
	
}
