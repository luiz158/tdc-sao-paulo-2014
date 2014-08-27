package br.com.elo7.producer;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/loga-servlet"})
public class LogaMinhaServlet extends HttpServlet {

	private static final long serialVersionUID = -5624004268124199986L;

	@Inject
 	private MeuLogger logger;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("Usando meu Servlet");
	}
	
}
