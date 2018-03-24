package main.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.connection.ConnectionFactory;
import main.java.model.Usuario;

public class UsuarioDAO {

	private Connection con;

	public List<Usuario> getListaDeTodosUsuario() {

		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario;

		String sql = "SELECT idUsuario, nome, usuario, chave, questoesRespondidas, email from usuarios order by nome";

		try {

			con = new ConnectionFactory().getConnection();

			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				usuario = new Usuario();
				usuario.setChave(rs.getString("chave"));
				usuario.setEmail(rs.getString("email"));
				usuario.setIdUsuario(rs.getInt("idusuario"));
				usuario.setNome(rs.getString("nome"));
				usuario.setQuestoesRespondidas(rs.getInt("questoesRespondidas"));
				usuario.setUsuario(rs.getString("usuario"));
				
				usuarios.add(usuario);
			}
			rs.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Erro de SQL:" + e.getMessage());
		}

		return usuarios;
	}

}
