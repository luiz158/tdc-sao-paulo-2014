package br.com.elo7.decorator1;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class TicketServiceDecorator implements TicketService {

	@Inject @Delegate
	private TicketService service;
	
	@Override
	public void orderTicket(Ticket ticket) {
		System.out.println("Doing Decorator things");
		service.orderTicket(new Ticket());
	}

}
