package bridge;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	protected abstract void colorIt();
	
}
