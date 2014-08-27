package factorymethod;

public class Car implements Vehicle {

	@Override
	public void speed() {
		System.out.println("Speed car");
	}

	@Override
	public void brake() {
		System.out.println("Brake car");
	}

}
