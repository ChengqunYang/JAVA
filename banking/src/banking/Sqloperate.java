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
		// 1. 准备连接数据库的 4 个字符串.
		// 1). 创建 Properties 对象
		Properties properties = new Properties();

		// 2). 获取 jdbc.properties 对应的输入流
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		// 3). 加载 2） 对应的输入流
		properties.load(in);
		// 4). 具体决定 user, password 等4 个字符串.
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		String jdbcUrl = properties.getProperty("jdbcUrl");
		String driver = properties.getProperty("driver");

		// 2. 加载数据库驱动程序(对应的 Driver 实现类中有注册驱动的静态代码块.)
		Class.forName(driver);

		// 3. 通过 DriverManager 的 getConnection() 方法获取数据库连接.
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
