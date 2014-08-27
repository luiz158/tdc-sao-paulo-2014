package br.com.elo7.lazy;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/injecao"})
public class CalculaFreteServlet extends HttpServlet {

	private static final long serialVersionUID = 9043462851307602199L;

	@Inject
	private Instance<CalculadoraDeFrete> calculadoraLazy;

	@PostConstruct
	public void depoisDeConstruir() {
		System.out.println("Servlet construida!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Sem a calculdora");
		CalculadoraDeFrete calculadora = calculadoraLazy.get();
		System.out.println("Com a calculdora");
		
		Double valorDoFrete = calculadora.calcula(Double.parseDouble(req.getParameter("valor")));
		
		resp.getOutputStream().print(" Valor do Frente calculado: " + valorDoFrete);
	}

}

