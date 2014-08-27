package br.com.caelum.vraptor.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.annotation.Log;
import br.com.caelum.vraptor.dao.ProdutoDao;
import br.com.caelum.vraptor.model.Produto;
import br.com.caelum.vraptor.validator.Validator;
import br.com.caelum.vraptor.view.Results;

@Controller
public class ProdutoController {
	
	private Result result;
	
	private ProdutoDao produtos;

	private Validator validator;

	@Inject
	public ProdutoController(Result result, ProdutoDao produtos, Validator validator) {
		this.result = result;
		this.produtos = produtos;
		this.validator = validator;
	}

	@Deprecated //CDI eyes only
	public ProdutoController() {
	}
	
	@Get("/produto/sobre")
	public void sobre() {
	}

	@Get
	public void lista() {
		List<Produto> listaDeProdutos = produtos.lista();
		result.include("produtos", listaDeProdutos);
	}
	
	@Get
	public void listaXml() {
		List<Produto> listaDeProdutos = produtos.lista();
		result.use(Results.xml()).from(listaDeProdutos).serialize();
	}
	
	@Get("/produto/1")
	@Log
	public Produto produto() {
		return produtos.lista().get(0);
	}
	
	@Get("/produto/formulario")
	public void formulario() {
	}

	@Post("/produto/adiciona")
	@Log
	public void adiciona(@Valid Produto produto) {
//		validator.check(produto.getQuantidade() > 0, new I18nMessage("erro", "A quantidade nao pode ser menor que zero"));
		
		validator.onErrorForwardTo(this).formulario();
		
		produtos.adiciona(produto);
		
		result.include("mensagem", "Produto adicionado com sucesso!");
		result.redirectTo(this).lista();
	}
	
	@Get("/produto/remove")
	public void remove(Produto produto) {
		produtos.remove(produto);
	}
}
