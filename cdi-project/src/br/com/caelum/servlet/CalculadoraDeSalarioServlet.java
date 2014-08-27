package br.com.caelum.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.modelo.CalculadoraDeSalarios;

@WebServlet(urlPatterns = {"/calcula-salario"})
public class CalculadoraDeSalarioServlet extends HttpServlet {

	private static final long serialVersionUID = 4880839348125408386L;

	@Inject
	private CalculadoraDeSalarios calculadoraDeSalarios;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getOutputStream().print("Calculadora usada: " + calculadoraDeSalarios.getClass());
	}
	
}
