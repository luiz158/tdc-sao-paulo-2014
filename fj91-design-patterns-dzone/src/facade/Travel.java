package facade;

import java.util.List;

public class Travel {

	private List<HotelBroker> hotels;
	
	private List<FlightBroker> flights;

	public Travel(List<HotelBroker> hotels, List<FlightBroker> flights) {
		this.hotels = hotels;
		this.flights = flights;
	}

	public List<HotelBroker> getHotels() {
		return hotels;
	}
	
	public List<FlightBroker> getFlights() {
		return flights;
	}
	
}
