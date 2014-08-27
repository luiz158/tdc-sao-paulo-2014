package br.com.caelum.fj31.txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import br.com.caelum.fj31.modelo.Livro;

public class LeituraDeObjetosTxt {

	public static void main(String[] args) throws IOException {
		File file = new File("arquivo-txt.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);

		String readLine = reader.readLine();
		ArrayList<Livro> livros = new ArrayList<>();
		while (readLine != null) {
			System.out.println(readLine);
			Livro livro = new Livro();
			livros.add(livro);
			readLine = reader.readLine();
		}
		reader.close();
	}
	
}
