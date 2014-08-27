package facade;

import java.util.Date;
import java.util.List;

public class FacadeHotel {

	private List<HotelBroker> hotelBroker;
	
	private List<FlightBroker> flightBroker;
	
	public Travel getTravel(Date from, Date to) {
		this.hotelBroker = new HotelBroker().getHotelFrom(from, to);
		this.flightBroker = new FlightBroker().getFlightFrom(from, to);
		
		return new Travel(hotelBroker, flightBroker);
	}

}
