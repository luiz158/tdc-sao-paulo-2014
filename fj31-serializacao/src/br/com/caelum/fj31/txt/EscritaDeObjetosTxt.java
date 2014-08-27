package br.com.caelum.fj31.txt;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscritaDeObjetosTxt {

	public static void main(String[] args) throws IOException {
		File file = new File("arquivo-txt.txt");
		FileOutputStream stream = new FileOutputStream(file);
		BufferedOutputStream outputStream = new BufferedOutputStream(stream);
		outputStream.write("Refactoring - Martin Fowler".getBytes());
		
		outputStream.flush();
		stream.close();
		outputStream.close();
	}
	
}
