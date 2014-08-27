package bridge;

public class Retangle extends Shape {

	public Retangle(Color color) {
		super(color);
	}

	@Override
	protected void colorIt() {
		this.color.fillColor();
	}

}
