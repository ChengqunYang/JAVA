package jdbc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

public class TestPool {
	Connection conn = null;
	PreparedStatement ps = null;
	MyDataSource dataSource = new MyDataSource();
	@Test
	public void testPool() {
		try {
			conn = dataSource.getConnection();
			String sql = "insert into account values(null,'wangwu',200)";
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//�黹����
			dataSource.addBack(conn);
		}
		
	}
}
