package br.com.caelum.livraria.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import br.com.caelum.livraria.modelo.Livro;

@Stateful //Um carrinho para cada cliente
@Remote(Carrinho.class) //Precisamos identificar a interface que sera acessada
public class CarrinhoBean implements Carrinho {

	private List<Livro> livros = new ArrayList<>();
	
	private double total;
	
	@Override
	public void adicionaLivro(Livro livro) {
		livros.add(livro);
		total += livro.getPreco();
		
		System.out.printf("Livro %s adicionado com sucesso!", livro.getNome());
	}

	@Override
	public List<Livro> getLivros() {
		System.out.println("Carrinho devolvendo a lista de livros");
		return this.livros;
	}

	@Override
	public double getTotal() {
		System.out.println("Carrinho devolvendo o total");
		return this.total;
	}

	@Override
	public void finalizaCompra() {
		System.out.println("Finalizando a compra");
		for (Livro livro : livros) {
			System.out.println(livro.getNome() + " - " + livro.getPreco());
		}
	}

}
