package main.java.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.commons.mail.EmailException;

import main.java.model.Usuario;
import main.java.service.UsuarioService;
import main.java.util.EmailUtil;

@ManagedBean(name = "emailBean")
@ViewScoped
public class EmailBean {

	private UsuarioService usuarioService = new UsuarioService();

	public EmailBean() {
		
	}
	
	public String enviarEmails() {

		try {
			List<Usuario> usuarios = usuarioService.getListaDeTodosUsuario();
			for (Usuario usuario : usuarios) {
				String mensagem = retornaMensagem(usuario.getNome());
				EmailUtil.enviarEmail("eneylton@hotmail.com", usuario.getEmail(), mensagem);
			}
		} catch (EmailException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}	

	private String retornaMensagem(String nome) {
		String mensagem;
		mensagem = "<p> Olá <b>" + nome + "</b></p>";
		return mensagem;
	}

}
