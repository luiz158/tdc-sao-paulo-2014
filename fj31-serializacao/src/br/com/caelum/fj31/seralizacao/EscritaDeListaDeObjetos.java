package br.com.caelum.fj31.seralizacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.fj31.modelo.Livro;

public class EscritaDeListaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Livro effectiveJava = new Livro(1L, "Effective Java 3", "9876543210", "Saraiva");
		Livro refactoring = new Livro(1L, "Refactoring", "1876543210", "Saraiva");
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(refactoring);
		livros.add(effectiveJava);
		
		FileOutputStream file = new FileOutputStream("objetos.txt");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		oos.writeObject(livros);
		
		oos.close();
	}
}
