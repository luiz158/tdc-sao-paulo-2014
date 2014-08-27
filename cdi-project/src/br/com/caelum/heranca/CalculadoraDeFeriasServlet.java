package br.com.caelum.heranca;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/calcula-ferias"})
public class CalculadoraDeFeriasServlet extends HttpServlet {

	private static final long serialVersionUID = 1251431164625680067L;

	@Inject @Calculadora
	private CalculadoraDeFerias calculadoraDeFerias;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		calculadoraDeFerias.calcula();
		resp.getOutputStream().print("Calculadora usada: " + calculadoraDeFerias.getClass());
	}
}
