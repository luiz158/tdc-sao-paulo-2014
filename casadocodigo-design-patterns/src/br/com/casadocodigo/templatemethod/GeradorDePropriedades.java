package br.com.casadocodigo.templatemethod;

import java.util.Map;

public class GeradorDePropriedades extends GeradorDeArquivo {

	@Override
	protected String gerarConteudo(Map<String, String> properties) {
		return null;
	}

	@Override
	protected byte[] processa(byte[] bytes) {
		return super.processa(bytes);
	}
}
