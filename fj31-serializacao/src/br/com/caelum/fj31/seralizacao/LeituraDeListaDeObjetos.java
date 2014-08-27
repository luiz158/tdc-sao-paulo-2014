package br.com.caelum.fj31.seralizacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import br.com.caelum.fj31.modelo.Livro;

public class LeituraDeListaDeObjetos {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("objetos.txt");
		ObjectInputStream ois = new ObjectInputStream(file);
		List<Livro> livros = (List<Livro>) ois.readObject();
		
		System.out.println(livros);
		ois.close();
	}
	
}
