package edu.xust.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import org.junit.Test;

public class JDBCTest {

	public <T> List<T> query(Class<T> clazz, String sql){
		return null;
	}
	
	/**
	 * ResultSet: �����. ��װ��ʹ�� JDBC ���в�ѯ�Ľ��. 
	 * 1. ���� Statement ����� executeQuery(sql) ���Եõ������.
	 * 2. ResultSet ���ص�ʵ���Ͼ���һ�����ݱ�. ��һ��ָ��ָ�����ݱ�ĵ�һ����ǰ��.
	 * ���Ե��� next() ���������һ���Ƿ���Ч. ����Ч�÷������� true, ��ָ������. �൱��
	 * Iterator ����� hasNext() �� next() �����Ľ����
	 * 3. ��ָ���λ��һ��ʱ, ����ͨ������ getXxx(index) �� getXxx(columnName)
	 * ��ȡÿһ�е�ֵ. ����: getInt(1), getString("name")
	 * 4. ResultSet ��ȻҲ��Ҫ���йر�. 
	 */
	@Test
	public void testResultSet(){
		//��ȡ id=4 �� customers ���ݱ�ļ�¼, ����ӡ
		
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			//1. ��ȡ Connection
			conn = JDBCTools.getConnection();
		//	System.out.println(conn);
			
			//2. ��ȡ Statement
			statement = conn.createStatement();
		//	System.out.println(statement);
			
			//3. ׼�� SQL
			String sql = "SELECT id, name, email, birth " +
					"FROM customers";
			
			//4. ִ�в�ѯ, �õ� ResultSet
			rs = statement.executeQuery(sql);
		//	System.out.println(rs);
			
			//5. ���� ResultSet
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString("name");
				String email = rs.getString(3);
				Date birth = rs.getDate(4);
				
				System.out.println(id);
				System.out.println(name);
				System.out.println(email);
				System.out.println(birth);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			//6. �ر����ݿ���Դ. 
			JDBCTools.release(rs, statement, conn);
		}
		
	}
	
	/**
	 * ͨ�õĸ��µķ���: ���� INSERT��UPDATE��DELETE
	 * �汾 1.
	 */
	public void update(String sql){
		Connection conn = null;
		Statement statement = null;
		
		try {
			conn = JDBCTools.getConnection();
			statement = conn.createStatement();
			statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JDBCTools.release(statement, conn);
		}
	}
	
	/**
	 * ͨ�� JDBC ��ָ�������ݱ��в���һ����¼. 
	 * 
	 * 1. Statement: ����ִ�� SQL ���Ķ���
	 * 1). ͨ�� Connection �� createStatement() ��������ȡ
	 * 2). ͨ�� executeUpdate(sql) ����ִ�� SQL ���.
	 * 3). ����� SQL ������ INSRET, UPDATE �� DELETE. �������� SELECT
	 * 
	 * 2. Connection��Statement ����Ӧ�ó�������ݿ��������������Դ. ʹ�ú�һ��Ҫ�ر�.
	 * ��Ҫ�� finally �йر� Connection �� Statement ����. 
	 * 
	 * 3. �رյ�˳����: �ȹرպ��ȡ��. ���ȹر� Statement ��ر� Connection
	 */
	@Test
	public void testStatement() throws Exception{
		/**˼·(�����)��
		 * 1. ��ȡ���ݿ�����
		 * 2. �ر�����
		 * 3.׼������ִ�е� SQL ���
		 * 4.ִ��sql����
		 * 1). ��ȡ���� SQL ���� Statement ����: 
		 * 2)���� Statement ����� executeUpdate(sql) ִ�� SQL �����в���
		 * 5.�ر� Statement ����.
		 */
		//1. ��ȡ���ݿ�����
		Connection conn = null;
		Statement statement = null;
		
		try {
			conn = getConnection2();
			
			//3. ׼������� SQL ���
			String sql = null;
			
//			sql = "INSERT INTO customers (NAME, EMAIL, BIRTH) " +
//					"VALUES('XYZ', 'syz@xust.edu.cn', '1990-12-12')";
//			sql = "DELETE FROM customers WHERE id = 1";
			sql = "UPDATE customers SET name = 'Tom' " +
					"WHERE id = 4";
			System.out.println(sql);
			
			//4. ִ�в���. 
			//1). ��ȡ���� SQL ���� Statement ����: 
			//���� Connection �� createStatement() ��������ȡ
			statement = conn.createStatement();
			
			//2). ���� Statement ����� executeUpdate(sql) ִ�� SQL �����в���
			statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				//5. �ر� Statement ����.
				if(statement != null)
					statement.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				//2. �ر�����
				if(conn != null)
					conn.close();							
			}
		}
		
	}
	
	@Test
	public void testGetConnection2() throws Exception{
		System.out.println(getConnection2()); 
	}
	
	public Connection getConnection2() throws Exception{
		//1. ׼���������ݿ�� 4 ���ַ���. 
		//1). ���� Properties ����
		Properties properties = new Properties();
		
		//2). ��ȡ jdbc.properties ��Ӧ��������
		InputStream in = 
				this.getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		
		//3). ���� 2�� ��Ӧ��������
		properties.load(in);
		
		//4). ������� user, password ��4 ���ַ���. 
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		String jdbcUrl = properties.getProperty("jdbcUrl");
		String driver = properties.getProperty("driver");
		
		//2. �������ݿ���������(��Ӧ�� Driver ʵ��������ע�������ľ�̬�����.)
		Class.forName(driver);
		
		//3. ͨ�� DriverManager �� getConnection() ������ȡ���ݿ�����. 
		return DriverManager.getConnection(jdbcUrl, user, password);
	}
	
	/**
	 * DriverManager �������Ĺ�����. 
	 * 1). ����ͨ�����ص� getConnection() ������ȡ���ݿ�����. ��Ϊ����
	 * 2). ����ͬʱ��������������: ��ע���˶�����ݿ�����, ����� getConnection()
	 * ����ʱ����Ĳ�����ͬ, �����ز�ͬ�����ݿ����ӡ� 
	 * @throws Exception 
	 */
	@Test
	public void testDriverManager() throws Exception{
		//1. ׼���������ݿ�� 4 ���ַ���. 
		//������ȫ����.
		String driverClass = "com.mysql.jdbc.Driver";
		//String driverClass2 = "om.microsoft.jdbc.sqlserver.SQLServerDriver";
		//JDBC URL
		String jdbcUrl = "jdbc:mysql:///test";
		//String jdbcUrl ="jdbc:microsoft:sqlserver://localhost:1433/sqljava "
		//user
		String user = "root";
		//	String user1 = "sa";
		//password
		String password = "975864";
		//String password1 = "123456";
		//2. �������ݿ���������(��Ӧ�� Driver ʵ��������ע�������ľ�̬�����.)
		//DriverManager.registerDriver(Class.forName(driverClass).newInstance());
		Class.forName(driverClass);
		//Class.forName(driverClass2);
		//3. ͨ�� DriverManager �� getConnection() ������ȡ���ݿ�����. 
		Connection connection = 
				DriverManager.getConnection(jdbcUrl, user, password);
//		connection = 
//				DriverManager.getConnection(jdbcUrl1, user1, password1);
		System.out.println(connection); 
		
	}
	
	/**
	 * Driver ��һ���ӿ�: ���ݿ⳧�̱����ṩʵ�ֵĽӿ�. �ܴ����л�ȡ���ݿ�����.
	 * ����ͨ�� Driver ��ʵ��������ȡ���ݿ�����.
	 * 
	 * 1. ���� mysql ����
	 * 1). ��ѹ mysql-connector-java-5.1.30.zip
	 * 2). �ڵ�ǰ��Ŀ���½� lib Ŀ¼
	 * 3). �� mysql-connector-java-5.1.30-bin.jar ���Ƶ� lib Ŀ¼��
	 * 4). �Ҽ� build-path , add to buildpath ���뵽��·����.s
	 * @throws SQLException 
	 */
	@Test
	public void testDriver() throws SQLException {
		//1. ����һ�� Driver ʵ����Ķ���
		Driver driver = new com.mysql.jdbc.Driver();
		//ʹ��mysql�ṩ��Driverʵ��
	
		//2. ׼���������ݿ�Ļ�����Ϣ: url, user, password
		String url = "jdbc:mysql://localhost:3306/test";
		//String url = "jdbc:mysql://127.0.0.1:3306/test";
		//jdbc��Э�飩��mysql����Э�飩://localhost:3306/test�������ƣ�
		Properties info = new Properties();
		info.put("user", "root");
		info.put("password", "975864");
		
		//3. ���� Driver �ӿڵġ�connect(url, info) ��ȡ���ݿ�����
		Connection connection = driver.connect(url, info);
		System.out.println(connection);
	}
	
	/**
	 * ��дһ��ͨ�õķ���, �ڲ��޸�Դ����������, ���Ի�ȡ�κ����ݿ������
	 * �������: �����ݿ����� Driver ʵ�����ȫ������url��user��password ����һ��
	 * �����ļ���, ͨ���޸������ļ��ķ�ʽʵ�ֺ;�������ݿ����. 
	 * @throws Exception 
	 */
	public Connection getConnection() throws Exception{
		String driverClass = null;
		String jdbcUrl = null;
		String user = null;
		String password = null;
		
		//��ȡ��·���µ� jdbc.properties �ļ�
		InputStream in = 
				getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		Properties properties = new Properties();
		properties.load(in);
		driverClass = properties.getProperty("driver");
		jdbcUrl = properties.getProperty("jdbcUrl");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
		
		//ͨ�����䳣�� Driver ����. 
		Driver driver = 
				(Driver) Class.forName(driverClass).newInstance();
		
		Properties info = new Properties();
		info.put("user", user);
		info.put("password", password);
		
		//ͨ�� Driver �� connect ������ȡ���ݿ�����. 
		Connection connection = driver.connect(jdbcUrl, info);
		
		return connection;
	}
	
	@Test
	public void testGetConnection() throws Exception{
		System.out.println(getConnection());
	}

}


