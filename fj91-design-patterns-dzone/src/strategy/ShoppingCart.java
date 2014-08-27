package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}

	public void pay(PaymentStrategy paymentStrategy) {
		Double totalValue = calculateTotalValue();
		
		paymentStrategy.pay(totalValue);
	}

	private Double calculateTotalValue() {
		Double total = 0.0;
		for (Item item: items) {
			total += item.getValue();
		}
		return total;
	}

	
}
