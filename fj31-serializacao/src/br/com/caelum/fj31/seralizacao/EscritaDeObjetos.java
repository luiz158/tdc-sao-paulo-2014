package br.com.caelum.fj31.seralizacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.caelum.fj31.modelo.Livro;

public class EscritaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Livro effectiveJava = new Livro(1L, "Effective Java 3", "9876543210", "Saraiva");
		
		ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("arquivo.txt"));
		writer.writeObject(effectiveJava); //Caso o objeto nao seja Serializable teremos a exception: NotSerializableException
		
		writer.close();
	}
	
}
