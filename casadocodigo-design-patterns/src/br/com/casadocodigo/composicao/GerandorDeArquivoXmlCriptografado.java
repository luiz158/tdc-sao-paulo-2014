package br.com.casadocodigo.composicao;

public class GerandorDeArquivoXmlCriptografado extends GeradorDeArquivoXml {

	@Override
	public void processar() {
		System.out.println("Processando Arquivo Xml Criptografado");
	}
	
	//Duplicamos o codigo pois precisamos de funcionalidade que esta separada em duas classes diferentes
	@Override
	public void gerarArquivo() {
		System.out.println("Gerando Conteudo do Arquivo Xml");
		System.out.println("Gerando Conteudo do Arquivo Criptografado"); //Duplicacao de codigo!!!
	}
	//Se tivessemos heranca multipla em Java poderiamos resolver o problema usando simplesmente heranca!
}
