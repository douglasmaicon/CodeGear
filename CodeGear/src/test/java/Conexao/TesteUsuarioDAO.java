package Conexao;

import br.eti.codegear.persistencia.jdbc.usuariosDAO;
import br.eti.codgear.persistencia.entidades.Usuarios;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		//testeCadastrar();
		//testeAlterar();
		testeExcluir();
	}
	
		
	public static void testeCadastrar(){
		Usuarios usu = new Usuarios();
		usu.setNome("teste");
		usu.setLogin("teste");
		usu.setSenha("123");
		//cadastrando usuario no BD
		usuariosDAO usuDAO = new usuariosDAO();
		usuDAO.cadastrar(usu);
		System.out.println("Cadastrado com sucesso!");
	}

	public static void testeAlterar(){
		Usuarios usu = new Usuarios();
		usu.setIdUsuario(2);
		usu.setSenha("321");
		//cadastrando usuario no BD
		usuariosDAO usuDAO = new usuariosDAO();
		usuDAO.alterar(usu);
		System.out.println("Alterado com sucesso!");		
	}
	
	public static void testeExcluir(){
		Usuarios usu = new Usuarios();
		usu.setIdUsuario(1);
		//cadastrando usuario no BD
		usuariosDAO usuDAO = new usuariosDAO();
		usuDAO.excluir(usu);
		System.out.println("Excluído com sucesso!");		
	}
	
}
