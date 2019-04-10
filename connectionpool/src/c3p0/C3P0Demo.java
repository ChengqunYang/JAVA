package c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import jdbc.util.JDBCUtil;

public class C3P0Demo {
	@Test
	public void testC3P0() {
	
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//1.����dataSource
			ComboPooledDataSource dataSource = new ComboPooledDataSource(); 

			//������ʲô���͵����ݿ�,���ʵ����ĸ����ݿ�,�û���,����.
			dataSource.setPassword("975864");
			dataSource.setUser("root");
			dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/bank");
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			
			//2.�õ����Ӷ���
			conn = dataSource.getConnection();
			String sql = "insert into account values(null,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "admin");
			ps.setInt(2, 200);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.release(ps, conn);
		}
	}
}
