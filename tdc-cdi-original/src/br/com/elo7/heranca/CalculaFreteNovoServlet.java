package br.com.elo7.heranca;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/calcula-frete-novo"})
public class CalculaFreteNovoServlet extends HttpServlet {

	private static final long serialVersionUID = 9043462851307602199L;
	
	@Inject @FreteAutomatico
	private CalculadoraDeFrete calculadora;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Double freteCalculado = calculadora.calcula(Double.parseDouble(req.getParameter("valor")));
		
		resp.getOutputStream().print("Valor do fete calculado: " + freteCalculado);
	}

}

