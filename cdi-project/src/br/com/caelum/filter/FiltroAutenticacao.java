package br.com.caelum.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/para-autenticar"})
public class FiltroAutenticacao implements Filter {
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpSession session = request.getSession();
		Object usuarioLogado = session.getAttribute("usuarioLogado");
		
		String paginaDeLogin = "login.jsf";
		String paginaAtual = request.getRequestURI();
		boolean usuarioDeslogado = usuarioLogado == null;
		boolean paginaNaoEhLogin = !paginaAtual.contains(paginaDeLogin);
		
		if (usuarioDeslogado && paginaNaoEhLogin) {
			HttpServletResponse response = (HttpServletResponse) resp;
			response.sendRedirect(paginaDeLogin);
		}
		
		chain.doFilter(req, resp);
	}

	@Override
	public void destroy() {
		
	}
}
