package br.eti.codegear.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/CodeGearDB","postgres","d22m02n85");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
