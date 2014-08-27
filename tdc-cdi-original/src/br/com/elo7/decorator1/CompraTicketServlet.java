package br.com.elo7.decorator1;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/comprar-ticket"})
public class CompraTicketServlet extends HttpServlet {

	private static final long serialVersionUID = 9043462851307602199L;

	@Inject
	private TicketService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service.orderTicket(new Ticket());
	}

}

