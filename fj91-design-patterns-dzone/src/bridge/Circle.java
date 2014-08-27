package bridge;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	protected void colorIt() {
		this.color.fillColor();
	}

}
