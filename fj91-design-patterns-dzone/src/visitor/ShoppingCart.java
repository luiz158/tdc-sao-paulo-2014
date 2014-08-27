package visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Visitable> items = new ArrayList<>();
	
	public void addItem(Visitable item) {
		this.items.add(item);	
	}
	
	public Double calculateTotalValue() {
		PostgateVisitor postgateVisitor = new PostgateVisitor();
		for (Visitable v: this.items) {
			v.accept(postgateVisitor);
		}
		return postgateVisitor.getTotalPostgate();
	}
}
