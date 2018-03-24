package main.java.service;

import java.util.List;

import main.java.dao.UsuarioDAO;
import main.java.model.Usuario;

public class UsuarioService {

	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public List<Usuario> getListaDeTodosUsuario() {
		return usuarioDAO.getListaDeTodosUsuario();
	}
	
}
