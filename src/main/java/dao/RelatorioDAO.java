package main.java.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.connection.ConnectionFactory;
import main.java.model.Resposta01;
import main.java.model.Resposta02;
import main.java.model.Resposta03;
import main.java.model.Resposta04;
import main.java.model.Resposta05;
import main.java.model.Resposta06;
import main.java.model.Resposta07;
import main.java.model.Resposta08;
import main.java.model.Resposta09;
import main.java.model.Resposta10;
import main.java.model.Resposta11;
import main.java.model.Resposta12;
import main.java.model.Resposta13;

public class RelatorioDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Connection con;

	public List<Resposta01> getTotalResposta01() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta01> Resposta01 = new ArrayList<Resposta01>();

		Resposta01 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='1'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta01();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta01.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta01;
	}
	
	
	public List<Resposta02> getTotalResposta02() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta02> Resposta02 = new ArrayList<Resposta02>();

		Resposta02 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='2'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta02();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta02.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta02;
	}
	
	public List<Resposta03> getTotalResposta03() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta03> Resposta03 = new ArrayList<Resposta03>();

		Resposta03 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='3'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta03();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta03.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta03;
	}
	
	
	public List<Resposta04> getTotalResposta04() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta04> Resposta04 = new ArrayList<Resposta04>();

		Resposta04 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='4'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta04();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta04.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta04;
	}

	
	public List<Resposta05> getTotalResposta05() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta05> Resposta05 = new ArrayList<Resposta05>();

		Resposta05 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='5'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta05();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta05.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta05;
	}


	public List<Resposta06> getTotalResposta06() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta06> Resposta06 = new ArrayList<Resposta06>();

		Resposta06 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='6'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta06();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta06.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta06;
	}

	public List<Resposta07> getTotalResposta07() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta07> Resposta07= new ArrayList<Resposta07>();

		Resposta07 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='7'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta07();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta07.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta07;
	}

	public List<Resposta08> getTotalResposta08() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta08> Resposta08= new ArrayList<Resposta08>();

		Resposta08 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='8'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta08();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta08.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta08;
	}


	public List<Resposta09> getTotalResposta09() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta09> Resposta09= new ArrayList<Resposta09>();

		Resposta09 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='9'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta09();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta09.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta09;
	}


	public List<Resposta10> getTotalResposta10() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta10> Resposta10= new ArrayList<Resposta10>();

		Resposta10 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='10'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta10();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta10.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta10;
	}


	
	public List<Resposta11> getTotalResposta11() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta11> Resposta11= new ArrayList<Resposta11>();

		Resposta11 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='11'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta11();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta11.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta11;
	}


	public List<Resposta12> getTotalResposta12() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta12> Resposta12= new ArrayList<Resposta12>();

		Resposta12 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='12'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta12();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta12.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta12;
	}


	public List<Resposta13> getTotalResposta13() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Resposta13> Resposta13= new ArrayList<Resposta13>();

		Resposta13 qst;

		String sql = "SELECT r.resposta as resposta, q.questao as questao, r.contador as total FROM respostas r inner join "
				+ "questoes q on r.idQuestao = q.idQuestao where q.idQuestao ='13'";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			qst = new Resposta13();
			qst.setQuestao(rs.getString("questao"));
			qst.setResposta(rs.getString("resposta"));
            qst.setTotal(rs.getInt("total"));

			Resposta13.add(qst);
		}

		rs.close();

		stmt.close();
		con.close();

		return Resposta13;
	}

	
}
