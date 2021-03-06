package br.eti.codegear.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.eti.codgear.persistencia.entidades.Usuarios;

public class usuariosDAO {
	
	private Connection conexao = ConexaoFactory.getConnection();
	
	public void cadastrar(Usuarios usu) {
		String sqlInsertUsu = "INSERT INTO usuarios (nome, login, senha) VALUES (?,?,?)";
		
		try {
			//cria um Statment = preparador para execução do comando sql
			PreparedStatement preparador = conexao.prepareStatement(sqlInsertUsu);
			//substitui casa d por seu respectivo parametro
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			//executa e fecha o preparador
			preparador.execute();
			preparador.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void alterar(Usuarios usu) {
		String sqlInsertUsu = "UPDATE usuarios SET senha=? WHERE idusuario=?";
		//dessa maneira o try fecha automaticamente o preparador
		try (PreparedStatement preparador = conexao.prepareStatement(sqlInsertUsu)){
			//substitui cada ? por seu respectivo parametro
			preparador.setString(1, usu.getSenha());
			preparador.setInt(2, usu.getIdUsuario());
			//executa e fecha o preparador
			preparador.execute();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void excluir(Usuarios usu) {
		String sqlInsertUsu = "delete from usuarios WHERE idusuario=?";
		//dessa maneira o try fecha automaticamente o preparador
		try (PreparedStatement preparador = conexao.prepareStatement(sqlInsertUsu)){
			//substitui cada ? por seu respectivo parametro
			preparador.setInt(1, usu.getIdUsuario());
			//executa e fecha o preparador
			preparador.execute();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
