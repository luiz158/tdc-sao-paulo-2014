package br.com.elo7.lazyselect;

import java.io.IOException;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/lazy"})
public class CalculaFreteServlet extends HttpServlet {

	private static final long serialVersionUID = 9043462851307602199L;

	@Inject @Any
	private Instance<CalculadoraDeFrete> calculadoraLazy;
	
	@SuppressWarnings("serial")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tipoDeSelecao = "assincrono";
		
		CalculadoraDeFrete calculadora = null;
		if (tipoDeSelecao.equals("sincrono")) {
			System.out.println("SINCRONO");
			calculadoraLazy = calculadoraLazy.select(new AnnotationLiteral<Frete>() {});
			calculadora = calculadoraLazy.get();
		} else if (tipoDeSelecao.equals("assincrono")) {
			calculadoraLazy = calculadoraLazy.select();
			calculadora = calculadoraLazy.get();
		}
		
		Double valorDoFrete = calculadora.calcula(Double.parseDouble(req.getParameter("valor")));
		
		resp.getOutputStream().print(" Valor do Frente calculado:" + valorDoFrete);
	}

}

