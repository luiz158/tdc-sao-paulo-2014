package br.com.casadocodigo.templatemethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class GeradorDeArquivo {

	public final void geraArquivo(String nome, Map<String, String> properties) throws IOException {
		String conteudo = gerarConteudo(properties);
		byte[] bytes = conteudo.getBytes();
		bytes = processa(bytes);
		FileOutputStream file = new FileOutputStream(nome);
		file.write(bytes);
		file.close();
	}

	protected byte[] processa(byte[] bytes) {
		return bytes;
	}

	protected abstract String gerarConteudo(Map<String, String> properties); //metodo do template pra ser implementado
	
}
