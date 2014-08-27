package factorymethod;

public class CarDriver extends VehicleDriver { //This one is a Concrete Creator class

	@Override
	protected Vehicle getVehicle() {
		return new Car(); //This knows how to create that object
	}
	
}
