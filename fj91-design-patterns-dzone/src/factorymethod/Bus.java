package factorymethod;

public class Bus implements Vehicle {

	@Override
	public void speed() {
		System.out.println("Speed bus");
	}

	@Override
	public void brake() {
		System.out.println("Brake bus");
	}

}
