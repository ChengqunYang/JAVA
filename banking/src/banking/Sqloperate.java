package banking;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Sqloperate {
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	ResultSet rs = null;

	public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		// 1. ׼���������ݿ�� 4 ���ַ���.
		// 1). ���� Properties ����
		Properties properties = new Properties();

		// 2). ��ȡ jdbc.properties ��Ӧ��������
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		// 3). ���� 2�� ��Ӧ��������
		properties.load(in);
		// 4). ������� user, password ��4 ���ַ���.
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		String jdbcUrl = properties.getProperty("jdbcUrl");
		String driver = properties.getProperty("driver");

		// 2. �������ݿ���������(��Ӧ�� Driver ʵ��������ע�������ľ�̬�����.)
		Class.forName(driver);

		// 3. ͨ�� DriverManager �� getConnection() ������ȡ���ݿ�����.
		conn = DriverManager.getConnection(jdbcUrl, user, password);

		return conn;
	}

	public static void release(ResultSet rs, PreparedStatement preparedStatement, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void insertemployee(int id, int password) throws ClassNotFoundException, IOException, SQLException {
		preparedStatement = getConnection().prepareStatement("insert into  np (id,password) values (?,?);",
				ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

		preparedStatement.setInt(1, id);
		preparedStatement.setInt(2, password);
		preparedStatement.executeUpdate();
	}
	public int EmployeeloginY(int id,int password) throws ClassNotFoundException, SQLException, IOException {
		preparedStatement = getConnection().prepareStatement("select values(?) from np where ",
				ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		preparedStatement.setInt(1, password);
		preparedStatement.setInt(2, id);
		rs = preparedStatement.executeQuery();
		int ps = rs.getInt(password);
		return ps;
	}

}
