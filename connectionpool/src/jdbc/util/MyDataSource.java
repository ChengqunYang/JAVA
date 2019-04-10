package jdbc.util;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

/**
 * 这是一个数据库连接池,
 * 1.先往池子里放十个连接.
 * 2.开始创建十个连接.
 * 3.来的程序通过getConnection获取连接.
 * 4.用完之后,使用addBack归还连接.
 * 5.扩容.
 * @author DELL
 *
 */
public class MyDataSource implements DataSource{
	List <Connection> list = new ArrayList<Connection>();
	public MyDataSource() {
		for(int i = 0; i < 10; i++) {
			Connection conn = JDBCUtil.getConn();
			list.add(conn);
		}
	}
	//该连接池对外公布的获取连接的方法.
	@Override
	public Connection getConnection() throws SQLException {
		if(list.size() == 0) {
			//移除之前先看一下有没有,没有的话再创建连接
			for (int i = 0;i < 5; i++) {
				Connection conn = JDBCUtil.getConn();
				list.add(conn);
			}
		}
		Connection conn = list.remove(0);
		return conn;
	}
	//用完之后返回.
	public void addBack(Connection conn) {
		list.add(conn);
	}
	
	
	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
