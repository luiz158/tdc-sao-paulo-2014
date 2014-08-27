package br.com.caelum.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.builder.FuncionarioBuilder;
import br.com.caelum.modelo.CalucladoraDeImpostos;
import br.com.caelum.modelo.Cargo;
import br.com.caelum.modelo.Funcionario;

@WebServlet(urlPatterns = {"/hello-cdi"})
public class IniciandoComCdiServlet extends HttpServlet {

	private static final long serialVersionUID = -2072470396507877659L;

	@Inject
	private CalucladoraDeImpostos calculadoraDeImpostos;
	
	public IniciandoComCdiServlet() {
		System.out.println("Construindo o Servlet..");
	}
	
	@PostConstruct
	public void construido() {
		System.out.println("Servlet construida e pronta!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String salario = req.getParameter("salario");
		System.out.println(salario);
		Double salarioBase = Double.parseDouble(salario);
		
		Funcionario alexandre = new FuncionarioBuilder().comSalarioBaseDe(salarioBase).comCargoDe(Cargo.ENGENHEIRO).build();
		Double impostoDeRenda = calculadoraDeImpostos.calculaImpostoDeRenda(alexandre);
		
		resp.getOutputStream().print(String.format("Salario base: R$ %.2f\nImposto devido: R$ %.2f", salarioBase, impostoDeRenda));
		System.out.println("Fim.");
	}
	
}
