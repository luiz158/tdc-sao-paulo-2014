package br.com.casadocodigo.rest.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/clientes", loadOnStartup = 1)
public class ClientesServlet extends HttpServlet {

	private static final long serialVersionUID = -8772582012151619642L;

	private String clientes;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("2 - Simulacao de WebService - Retornando clientes");
		resp.getWriter().print(clientes);
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
		try {
			URL url = new URL("file:///Users/alexandregama/workspace-caelum/casadocodigo-rest/resources/clientes.xml");
			InputStream inputStream = url.openConnection().getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			
			String linha = null;
			while((linha = reader.readLine()) != null) {
				clientes = clientes + linha;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
