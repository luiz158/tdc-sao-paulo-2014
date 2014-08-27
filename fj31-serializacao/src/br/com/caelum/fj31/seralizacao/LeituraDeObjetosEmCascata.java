package br.com.caelum.fj31.seralizacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.caelum.fj31.modelo.Categoria;

public class LeituraDeObjetosEmCascata {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream reader = new ObjectInputStream(new FileInputStream("arquivo.txt"));
		
		Categoria categoria = (Categoria) reader.readObject();
		
		System.out.println(categoria);
		
		reader.close();
	}
}
