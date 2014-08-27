package br.com.elo7.qualifier;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/calcula-frete"})
public class CalculaFreteServlet extends HttpServlet {

	private static final long serialVersionUID = 9043462851307602199L;
	
	@Inject @Frete(tipo = TipoFrete.AUTOMATICO, viaSedex = true)
	private CalculadoraDeFrete calculadora;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Double valor = Double.valueOf(req.getParameter("valor"));
		
		Double frete = calculadora.calcula(valor);
		
		resp.getOutputStream().print("O calculo do frete eh: " + frete);
	}

}

