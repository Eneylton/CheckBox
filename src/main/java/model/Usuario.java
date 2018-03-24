package main.java.model;

public class Usuario {

	private int idUsuario;
	private String nome;
	private String usuario;
	private String chave;
	private int questoesRespondidas;
	private String email;

	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public int getQuestoesRespondidas() {
		return questoesRespondidas;
	}
	public void setQuestoesRespondidas(int questoesRespondidas) {
		this.questoesRespondidas = questoesRespondidas;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
