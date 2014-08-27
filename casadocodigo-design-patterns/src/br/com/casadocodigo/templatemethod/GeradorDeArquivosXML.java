package br.com.casadocodigo.templatemethod;

import java.util.Map;

public class GeradorDeArquivosXML extends GeradorDeArquivo {

	@Override
	protected String gerarConteudo(Map<String, String> properties) {
		StringBuilder builder = new StringBuilder();
		builder.append("<properties>");
		for (String prop: properties.keySet()) {
			builder.append("<" + prop + ">" + properties.get(prop) + "</" + prop + "/>");
		}
		builder.append("</properties>");
		return builder.toString();
	}
	
	@Override
	protected byte[] processa(byte[] bytes) {
		return super.processa(bytes);
	}

}
