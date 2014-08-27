package facade;

import java.util.Date;

public class TestFacade {

	public static void main(String[] args) {
		Date from = new Date();
		Date to = new Date();
		
		FacadeHotel facade = new FacadeHotel();
		Travel travelInformations = facade.getTravel(from, to);
		
		System.out.println(travelInformations);
	}
	
}
