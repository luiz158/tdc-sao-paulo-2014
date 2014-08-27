package br.com.caelum.lazy;

import java.io.IOException;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/simula-desconto"})
public class SimuladoraDeDescontoServlet extends HttpServlet {

	private static final long serialVersionUID = -5298123653495142360L;

	@Inject @SimuladorDesconto
	private Instance<SimuladorDeDesconto> simuladorDeDescontoLazy; 
	//aqui faremos de forma lazy, ou seja, so sera instanciado quando o metodo get for chamado
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SimuladorDeDesconto simuladorDeDesconto = simuladorDeDescontoLazy.get();
		resp.getOutputStream().print("Usando a classe: " + simuladorDeDesconto.getClass());
	}
}
