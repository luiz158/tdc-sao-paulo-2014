package visitor;

public class PostgateVisitor implements Visitor {

	private Double totalPostgate;
	
	@Override
	public void visit(Book book) {
		if (book.getPrice() > 100) {
			this.totalPostgate =+ book.getPrice();
		}
	}

	@Override
	public void visit(Dvd dvd) {
		if (dvd.getPrice() > 50) {
			this.totalPostgate =+ dvd.getPrice();
		} else if (dvd.getPrice() <= 50) {
			this.totalPostgate =+ dvd.getPrice() * 0.10;
		}
	}

	public Double getTotalPostgate() {
		return totalPostgate;
	}
	
}
