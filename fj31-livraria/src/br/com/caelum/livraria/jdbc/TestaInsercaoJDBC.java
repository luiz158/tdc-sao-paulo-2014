package br.com.caelum.livraria.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.livraria.modelo.Livro;

public class TestaInsercaoJDBC {

	public static void main(String[] args) throws SQLException {
		Livro livro = new Livro();
		Connection con = DriverManager.getConnection("");
		PreparedStatement stmt = con.prepareStatement("insert into Livro (nome, editora) values (?, ?)");
		stmt.setString(1, livro.getNome());
		stmt.setString(2, livro.getEditora());
		stmt.execute();
		con.close();
		stmt.close();
	}
	
}
