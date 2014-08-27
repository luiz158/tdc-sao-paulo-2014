package br.com.caelum.observerqualificador;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/cadastra-empregado"})
public class CadastraEmpregadoServlet extends HttpServlet {

	private static final long serialVersionUID = -4578387350481571987L;

	@Inject
	private GerenciadorDeEmpregados gerenciador; 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		gerenciador.cadastra(new Empregado());
		
		gerenciador.demite(new Empregado());	
	}
}
