package br.com.elo7.decorator1;

public class TicketServiceImpl implements TicketService {

	@Override
	public void orderTicket(Ticket ticket) {
		System.out.println("Ordering Ticket");
	}

}
