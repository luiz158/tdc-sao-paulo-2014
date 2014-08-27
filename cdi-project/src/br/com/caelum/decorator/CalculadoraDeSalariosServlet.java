package br.com.caelum.decorator;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/calculadora-decorator")
public class CalculadoraDeSalariosServlet extends HttpServlet {

	private static final long serialVersionUID = 9137390727819716970L;

	@Inject @CalculadoraPorAno(ano = 2014)
	private CalculadoraDeSalarios calculadora;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		calculadora.calcula();
	}
	
}
