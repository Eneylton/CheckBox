package main.java.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.connection.ConnectionFactory;
import main.java.model.Questao01;
import main.java.model.Questao02;
import main.java.model.Questao03;
import main.java.model.Questao04;
import main.java.model.Questao05;
import main.java.model.Questao06;
import main.java.model.Questao07;
import main.java.model.Questao08;
import main.java.model.Questao09;
import main.java.model.Questao10;
import main.java.model.Questao11;
import main.java.model.Questao12;
import main.java.model.Questao13;
import main.java.model.Questao14;
import main.java.model.Questao15;
import main.java.model.Questao16;
import main.java.model.Questao17;
import main.java.model.Questao18;

public class InscritosDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Connection con;

	public int getTotalInscritos() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		int total = 0;

		String sql = "SELECT count(idCandidato) as total "
				+ "FROM Candidato c ";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		rs.next();

		total = rs.getInt("total");

		rs.close();

		stmt.close();
		con.close();

		return total;
	}

	public List<Questao01> getTotalQuestao01() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao01> questao01 = new ArrayList<Questao01>();

		Questao01 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='1';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao01();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao01.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao01;
	}

	public List<Questao02> getTotalQuestao02() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao02> questao02 = new ArrayList<Questao02>();

		Questao02 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='2';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao02();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao02.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao02;
	}

	public List<Questao03> getTotalQuestao03() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao03> questao03 = new ArrayList<Questao03>();

		Questao03 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='3';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao03();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao03.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao03;
	}

	public List<Questao04> getTotalQuestao04() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao04> questao04 = new ArrayList<Questao04>();

		Questao04 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='4';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao04();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao04.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao04;
	}

	public List<Questao05> getTotalQuestao05() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao05> questao05 = new ArrayList<Questao05>();

		Questao05 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='5';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao05();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao05.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao05;
	}

	public List<Questao06> getTotalQuestao06() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao06> questao06 = new ArrayList<Questao06>();

		Questao06 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='6';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao06();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao06.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao06;
	}

	public List<Questao07> getTotalQuestao07() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao07> questao07 = new ArrayList<Questao07>();

		Questao07 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='7';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao07();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao07.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao07;
	}

	public List<Questao08> getTotalQuestao08() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao08> questao08 = new ArrayList<Questao08>();

		Questao08 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='8';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao08();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao08.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao08;
	}

	public List<Questao09> getTotalQuestao09() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao09> questao09 = new ArrayList<Questao09>();

		Questao09 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='9';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao09();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao09.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao09;
	}

	public List<Questao10> getTotalQuestao10() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao10> questao10 = new ArrayList<Questao10>();

		Questao10 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='10';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao10();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao10.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao10;
	}

	public List<Questao11> getTotalQuestao11() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao11> questao11 = new ArrayList<Questao11>();

		Questao11 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='11';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao11();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao11.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao11;
	}

	public List<Questao12> getTotalQuestao12() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao12> questao12 = new ArrayList<Questao12>();

		Questao12 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='12';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao12();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao12.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao12;
	}

	public List<Questao13> getTotalQuestao13() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao13> questao13 = new ArrayList<Questao13>();

		Questao13 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='13';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao13();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao13.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao13;
	}

	public List<Questao14> getTotalQuestao14() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao14> questao14 = new ArrayList<Questao14>();

		Questao14 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='14';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao14();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao14.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao14;
	}

	public List<Questao15> getTotalQuestao15() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao15> questao15 = new ArrayList<Questao15>();

		Questao15 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='15';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao15();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao15.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao15;
	}

	public List<Questao16> getTotalQuestao16() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao16> questao16 = new ArrayList<Questao16>();

		Questao16 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='16';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao16();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao16.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao16;
	}

	public List<Questao17> getTotalQuestao17() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao17> questao17 = new ArrayList<Questao17>();

		Questao17 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='17';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao17();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao17.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao17;
	}
	
	

	public List<Questao18> getTotalQuestao18() throws SQLException {
		this.con = new ConnectionFactory().getConnection();

		List<Questao18> questao18 = new ArrayList<Questao18>();

		Questao18 questao;

		String sql = "SELECT r.resposta as resposta,r.contador as total FROM "
				+ "respostas as r where idQuestao='18';";

		PreparedStatement stmt;

		stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			questao = new Questao18();
			questao.setQuestao(rs.getString("resposta") + "");
			questao.setTotal(rs.getInt("total"));

			questao18.add(questao);
		}

		rs.close();

		stmt.close();
		con.close();

		return questao18;
	}

}
