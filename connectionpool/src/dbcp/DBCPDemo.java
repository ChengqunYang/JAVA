package dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import jdbc.util.JDBCUtil;

//��ʹ�������ļ�
public class DBCPDemo {
	
	@Test
	public void testDBCP01() {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//1.��������Դ����
			BasicDataSource dataSource = new BasicDataSource();
			
			//������ʲô���͵����ݿ�,���ʵ����ĸ����ݿ�,�û���,����.
			dataSource.setPassword("975864");
			dataSource.setUsername("root");
			dataSource.setUrl("jdbc:mysql://localhost:3306/bank");
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			//2.�õ����Ӷ���
			conn = dataSource.getConnection();
			String sql = "insert into account values(null,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "admin");
			ps.setInt(2, 200);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.release(ps, conn);
		}
	}
}
