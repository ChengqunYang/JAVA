package jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
	private static final Connection Connection = null;
	static String driverClass = null;
	static String url = null;
	static String name  = null;
	static String password = null;
	static{
		//1.����һ���������ö���
		Properties properties =  new Properties();
		InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
		//����������:
		try {
			properties.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//��ȡ����
		driverClass = properties.getProperty("driverClass");
		url = properties.getProperty("url");
		name = properties.getProperty("name");
		password = properties.getProperty("password");
		
		
	}
//��ȡ���Ӷ���
	public static Connection getConn(){
		
		try {
			Class.forName(driverClass);
			return DriverManager.getConnection(url,name,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
//�ͷ���Դ  ����ѯ��ʱ�������������
	public static void release(ResultSet rs,Statement st,Connection conn){
		closeRs(rs);
		closeSt(st);
		closeConn(conn);
	}
//����,�ͷ���Դ,����������ʱ������������
	public static void release(Statement st,Connection conn){
		closeSt(st);
		closeConn(conn);
	}
	
	private static void closeRs(ResultSet rs){
		try {
			if(rs != null)
			{
			rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			rs = null;
		}
	}
	private static void closeSt(Statement st){
		try {
			if(st != null)
			{
			st.close();
			}
		} catch (SQLException e) {
			e.printStackTrace() ;
		}finally {
			st = null;
		}
	}
	private static void closeConn(Connection conn){
		try {
			if(conn != null)
			{
			conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			conn = null;
		}
	}
}
