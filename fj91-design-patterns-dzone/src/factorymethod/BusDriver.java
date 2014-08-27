package factorymethod;

public class BusDriver extends VehicleDriver {

	@Override
	protected Vehicle getVehicle() {
		return new Bus();
	}

}
