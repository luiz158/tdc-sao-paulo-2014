package factorymethod;

public abstract class VehicleDriver { //This is a Creator class

	protected abstract Vehicle getVehicle();
	
	protected void vehicleSpeed() {
		getVehicle().speed();
	}
	
	protected void vehicleBrake() {
		getVehicle().brake();
	}
	
}
