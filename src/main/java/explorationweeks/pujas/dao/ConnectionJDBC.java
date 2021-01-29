package explorationweeks.pujas.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {

	private static String db = "pujasdb";
	private static String login = "Altia";
	private static String pwd = "%Altia1234";
	private static String url = "jdbc:mariadb:http://172.30.243.53:3306/" + db;

	private Connection connection;

	public ConnectionJDBC() {

	}

	public Connection getConnection() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, pwd);

		} catch (final Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
