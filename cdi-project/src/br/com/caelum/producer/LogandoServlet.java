package br.com.caelum.producer;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/loga"})
public class LogandoServlet extends HttpServlet {

	private static final long serialVersionUID = -8320580535892177146L;

	@Inject
	private MyLogger myLogger;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Usando o Logger");
		myLogger.info("Usando o Logger slf4j");
	}
	
}
