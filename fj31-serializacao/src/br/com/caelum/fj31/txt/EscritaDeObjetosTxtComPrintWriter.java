package br.com.caelum.fj31.txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscritaDeObjetosTxtComPrintWriter {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter printWriter = new PrintWriter(new File("livros.txt"));
		
		printWriter.print("blabla");
		
		printWriter.close();
	}
}
