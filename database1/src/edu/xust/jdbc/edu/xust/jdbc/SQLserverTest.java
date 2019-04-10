package edu.xust.jdbc;

import java.util.Properties;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class SQLserverTest {
	
	public static void main(String[] args) throws Exception{

		Connection conn = null;
	
	
			conn = getConnection();
			//main������
				String sql = null;
			
		sql = "INSERT INTO customers (SSN,NAME, EMAIL, BIRTH) " +
				"VALUES(140203199010039922,'Yuna', 'yy@xust.edu.cn', '1990-10-03')";
		//sql = "DELETE FROM customers WHERE id = 1";
		//sql = "UPDATE customers SET name = 'TOM' " +"WHERE id = 1";
	   update(sql);
	    
	    	sql = "SELECT ssn,id, name, email, birth FROM customers";
	    	query(sql);

	}
	//��release������������
	 /**(1) �ر� Statement �� Connection��ResultSet
	  * �رյ�˳����: �ȹرպ��ȡ��. ���ȹر� Statement ��ResultSet����ر� Connection
	  * @param rs
	  * @param statement
	  * @param conn
	  */
	public static void release(ResultSet rs,Statement statement, Connection conn) {
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		if (statement != null) {
			try {
				statement.close();
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
	
	/**
	 *(2) �ر� Statement �� Connection
	 * I.Connection��Statement ����Ӧ�ó�������ݿ��������������Դ. ʹ�ú�һ��Ҫ�ر�.
	 * ��Ҫ�� finally �йر� Connection �� Statement ����. 
	 * 
	 *II.�رյ�˳����: �ȹرպ��ȡ��. ���ȹر� Statement ��ر� Connection
	 * @param statement
	 * @param conn
	 */
	public static void release(Statement statement, Connection conn) {
		if (statement != null) {
			try {
				statement.close();
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

	public static void query(String sql){
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {

			conn = getConnection();
			statement = conn.createStatement();

			rs = statement.executeQuery(sql);
	
			while(rs.next()){
				int id = rs.getInt(2);
				String name = rs.getString("name");
				String email = rs.getString(4);
				Date birth = rs.getDate(5);
				
				System.out.println(id);
				System.out.println(name);
				System.out.println(email);
				System.out.println(birth);
			}
			
		} catch (Exception e) {
					e.printStackTrace();
		} finally{
					release(rs, statement, conn);
		}
	}
	public static void update(String sql){
		//һ��ʹ��Statement ���󣬶����ݿ���м򵥵Ĳ��롢ɾ���͸��²�����
		/**˼·(�����)��
		 * 1. ��ȡ���ݿ�����
		 * 2. �ر�����
		 * 3.׼������ִ�е� SQL ���
		 * 4.ִ��sql����
		 * 1). ��ȡ���� SQL ���� Statement ����: 
		 * 2)���� Statement ����� executeUpdate(sql) ִ�� SQL �����в���
		 * 5.�ر� Statement ����.
		 * ����������ߵĲ���,Suround with-->try/catch block��������׳��쳣
		 *��̬�������õ�ҲӦ���Ǿ�̬�ķ���
		 */
		Connection conn = null;
		Statement statement = null;
		
		try {
			conn = getConnection();
			statement = conn.createStatement();
			statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			release(statement, conn);
		}
	}

public static Connection getConnection() throws Exception{
			//1. ׼���������ݿ�� 4 ���ַ���. 
			//1). ���� Properties ����
			Properties properties = new Properties();
			
			//2). ��ȡ jdbc.properties ��Ӧ��������
		InputStream in = SQLserverTest.class.getClassLoader().getResourceAsStream(
				"jdbc.properties");
			
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
}
