package br.com.caelum.fj31.seralizacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.caelum.fj31.modelo.Categoria;
import br.com.caelum.fj31.modelo.Video;

public class EscritaDeObjetoEmCascata {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Categoria categoria = new Categoria("Terror");
		categoria.setVideo(new Video("Jogos Mortais"));
		
		ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("arquivo.txt"));
		writer.writeObject(categoria);
		
		writer.close();
		System.out.println("Escrita finalizada");
	}
	
	//Caso a classe Video nao seja Serializable teremos a Exception pois nao temos Serializacao em cascata
}
