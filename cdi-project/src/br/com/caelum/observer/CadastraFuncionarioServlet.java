package br.com.caelum.observer;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/cadastra-usuario"})
public class CadastraFuncionarioServlet extends HttpServlet {

	private static final long serialVersionUID = -1814225291020420371L;

	@Inject
	private CadastraFuncionario cadastraFuncionario; 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Funcionario funcionario = new Funcionario();
		cadastraFuncionario.cadastra(funcionario); 
	}
}
