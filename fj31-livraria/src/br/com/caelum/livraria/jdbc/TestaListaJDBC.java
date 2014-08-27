package br.com.caelum.livraria.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.livraria.modelo.Livro;

public class TestaListaJDBC {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("");
		PreparedStatement stmt = con.prepareStatement("select * from Livro");
		ResultSet rs = stmt.executeQuery();
		
		List<Livro> livros = new ArrayList<>();
		while (rs.next()) {
			Livro livro = new Livro();
			livro.setNome(rs.getString("nome"));
			livros.add(livro);
		}
	}
	
}
