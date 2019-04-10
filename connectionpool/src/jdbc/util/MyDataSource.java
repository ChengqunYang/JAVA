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
 * ����һ�����ݿ����ӳ�,
 * 1.�����������ʮ������.
 * 2.��ʼ����ʮ������.
 * 3.���ĳ���ͨ��getConnection��ȡ����.
 * 4.����֮��,ʹ��addBack�黹����.
 * 5.����.
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
	//�����ӳض��⹫���Ļ�ȡ���ӵķ���.
	@Override
	public Connection getConnection() throws SQLException {
		if(list.size() == 0) {
			//�Ƴ�֮ǰ�ȿ�һ����û��,û�еĻ��ٴ�������
			for (int i = 0;i < 5; i++) {
				Connection conn = JDBCUtil.getConn();
				list.add(conn);
			}
		}
		Connection conn = list.remove(0);
		return conn;
	}
	//����֮�󷵻�.
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
