package br.com.caelum.typed;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/calcular-desconto"})
public class CalculadoraDeDescontosServlet extends HttpServlet {

	private static final long serialVersionUID = -8959274152808480708L;

	@Inject
	private CalculadoraDeDescontos2005 calculadoraDeDescontos;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getOutputStream().print("Calculadora usada: " + calculadoraDeDescontos.getClass());
		calculadoraDeDescontos.calcula();
	}
}
