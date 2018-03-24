package main.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.connection.ConnectionFactory;
import main.java.model.Questao;
import main.java.model.Resposta;
import main.java.model.Usuario;

public class PesquisaDAO {

	private Connection con;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List getQuestaoERespostas(int idQuestao) {
		
		List questaoCompleta = new ArrayList();
		List<Resposta> respostas = new ArrayList<Resposta>();

		Resposta resposta;
		Questao questao = new Questao();
		questao.setIdQuestao(idQuestao);
		
		String sql = "SELECT questao, idResposta, resposta, checkin,subjetiva from respostas as r, questoes as q where q.idQuestao = ? and r.idQuestao = ? order by idResposta";
		
		try {
			
			con = new ConnectionFactory().getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, idQuestao);
			stmt.setInt(2, idQuestao);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				questao.setQuestao(rs.getString("questao"));	
				questao.setCheckin(rs.getInt("checkin"));
				questao.setSubjetiva(rs.getInt("subjetiva"));
				
				resposta = new Resposta();
				resposta.setIdResposta(rs.getInt("idResposta"));
				resposta.setResposta(rs.getString("resposta"));
			

				respostas.add(resposta);
			}
			
			
			questaoCompleta.add(questao);
			questaoCompleta.add(respostas);
			
			rs.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro de SQL:" + e.getMessage());
		}
		
		return questaoCompleta;
	}
	
	public void registraResposta(int idUsuario, int idResposta){
		
		String sql = " UPDATE respostas SET contador = (contador + 1) WHERE idResposta = ? ";

		try {
		
			con = new ConnectionFactory().getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, idResposta);

			stmt.execute();
			stmt.close();

			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro de SQL:" + e.getMessage());
		}
		
		sql = " UPDATE usuarios SET questoesRespondidas = (questoesRespondidas + 1) WHERE idUsuario = ? ";

		try {
		
			con = new ConnectionFactory().getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, idUsuario);

			stmt.execute();
			stmt.close();

			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro de SQL:" + e.getMessage());
		}
				
	}

	public void registraAberta(int idUsuario, int idResposta, String resposta){
		
		String sql = " UPDATE respostas SET contador = (contador + 1) WHERE idResposta = ? ";

		try {
		
			con = new ConnectionFactory().getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, idResposta);

			stmt.execute();
			stmt.close();

			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro de SQL:" + e.getMessage());
		}
		
		sql = " UPDATE usuarios SET questoesRespondidas = (questoesRespondidas + 1) WHERE idUsuario = ? ";

		try {
		
			con = new ConnectionFactory().getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, idUsuario);

			stmt.execute();
			stmt.close();

			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro de SQL:" + e.getMessage());
		}

		sql = "INSERT INTO respostas_abertas (respostas) VALUES (?)";

		try {
		
			con = new ConnectionFactory().getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, resposta);

			stmt.execute();
			stmt.close();

			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro de SQL:" + e.getMessage());
		}

	}

	
	public Usuario getUsuario(String chave) {
		
		Usuario usuario = new Usuario();
		
		String valor = "2";
		
		usuario.setChave(valor);
		
		String sql = "SELECT idUsuario, nome, usuario, questoesRespondidas from usuarios where chave = ?";
		
		try {
			
			con = new ConnectionFactory().getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, usuario.getChave());

			ResultSet rs = stmt.executeQuery();

			rs.next();
			
			usuario.setIdUsuario(rs.getInt("idUsuario"));
			usuario.setNome(rs.getString("nome"));
			usuario.setUsuario(rs.getString("usuario"));
			usuario.setQuestoesRespondidas(rs.getInt("questoesRespondidas"));	
							
			rs.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro de SQL:" + e.getMessage());
			usuario = null;
		}
		
		return usuario;

	}

	
	
}
