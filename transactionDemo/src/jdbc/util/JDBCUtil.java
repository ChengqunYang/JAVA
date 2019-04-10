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
		//1.建立一个属性配置对象
		Properties properties =  new Properties();
		InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
		//导入输入流:
		try {
			properties.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//读取属性
		driverClass = properties.getProperty("driverClass");
		url = properties.getProperty("url");
		name = properties.getProperty("name");
		password = properties.getProperty("password");
		
		
	}
//获取连接对象
	public static Connection getConn(){
		
		try {
			Class.forName(driverClass);
			return DriverManager.getConnection(url,name,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
//释放资源  做查询的时候接收三个参数
	public static void release(ResultSet rs,Statement st,Connection conn){
		closeRs(rs);
		closeSt(st);
		closeConn(conn);
	}
//重载,释放资源,做插入等语句时接收两个参数
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
