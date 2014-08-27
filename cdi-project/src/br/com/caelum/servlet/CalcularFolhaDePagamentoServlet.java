package br.com.caelum.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.builder.FuncionarioBuilder;
import br.com.caelum.calculadora.CalculadoraFolhaPagamento;
import br.com.caelum.modelo.Folha;
import br.com.caelum.modelo.Funcionario;
import br.com.caelum.qualifiers.PlanoDeCargos;
import br.com.caelum.qualifiers.Simulador;

@WebServlet(urlPatterns = {"/calcular-folha"})
public class CalcularFolhaDePagamentoServlet extends HttpServlet {

	private static final long serialVersionUID = 2115140678579879113L;

 	@Inject 
 	@Simulador(planoDeCargos = PlanoDeCargos.VERSAO_2013)
	private CalculadoraFolhaPagamento calculadoraDeFolha;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Funcionario alexandre = new FuncionarioBuilder().comSalarioBaseDe(100.0).build();
		Funcionario fernando = new FuncionarioBuilder().comSalarioBaseDe(200.0).build();
		
		Folha folha = calculadoraDeFolha.calculaFolha(Arrays.asList(alexandre, fernando));
		
		System.out.println("Calculou a Folha: " + folha);
	}
}
