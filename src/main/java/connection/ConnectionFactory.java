package main.java.connection;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory implements Serializable {

	private static final long serialVersionUID = -5485676185648069697L;

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
//					"jdbc:mysql://172.17.14.36/pesquisa_interna", "", "");
					"jdbc:mysql://localhost/db_avaliacaocheckbox", "root", "ti1234");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
		
		try {
			System.out.println("Conexao Realizada com sucesso!");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
