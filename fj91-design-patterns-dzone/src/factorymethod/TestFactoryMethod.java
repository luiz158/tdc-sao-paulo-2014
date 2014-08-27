package factorymethod;

public class TestFactoryMethod {

	public static void main(String[] args) {
		handleVehicleDriver(new BusDriver());
	}

	private static void handleVehicleDriver(VehicleDriver driver) {
		driver.vehicleSpeed();
	}
	
}
