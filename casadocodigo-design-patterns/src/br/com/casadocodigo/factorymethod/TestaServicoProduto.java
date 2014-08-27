package br.com.casadocodigo.factorymethod;

public class TestaServicoProduto {

	public static void main(String[] args) {
		ServicoAbstrato<Produto> servico = new ServicoProduto(new GeradorDePdf());
		
		servico.geraArquivoDaEntidade(1l, "produto.pdf");
	}
	
}
