package tdc;

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

@WebServlet(urlPatterns = "/fluxo")
public class FluxoDeCompraServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject //PONTO DE INJECAO
	private MeuLogger logger;

	@Inject @Any
	private Instance<CalculadoraDeFrete> calculadoraLazy;
	
	private CarrinhoDeCompras carrinho;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		logger.info("Iniciando o Fluxo de Pagamento");
		
		String tipoEscolhidoPeloUsuario = "M";
		if (tipoEscolhidoPeloUsuario.equals("A")) {
			Instance<CalculadoraDeFrete> calculadora = calculadoraLazy.select(new AnnotationLiteral<FreteAutomatico>() {});
			calculadora.get().calcula(1000.0);
		} else if (tipoEscolhidoPeloUsuario.equals("M")) {
			Instance<CalculadoraDeFrete> calculadora = calculadoraLazy.select(new AnnotationLiteral<FreteManual>() {});
			calculadora.get().calcula(1000.0);
		}
		
		carrinho.finalizaCompra();
//		Double valorTotal = 1000.0;
//		Double frete = calculadoraAutomatica.calcula(valorTotal);
//		resp.getOutputStream().print(frete);
	}

}
