package br.com.caelum.interceptor;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/para-auditar")
public class ParaAuditarServlet extends HttpServlet {

	private static final long serialVersionUID = -6756668168356397235L;
		
	@Inject
	private GestoraDePermissao gestora;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (gestora.permite()) {
			System.out.println("Acesso ok!");
		} else {
			System.out.println("Acesso negado!");
		}
	}
	
	
}
