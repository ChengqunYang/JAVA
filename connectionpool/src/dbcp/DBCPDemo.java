package dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import jdbc.util.JDBCUtil;

//不使用配置文件
public class DBCPDemo {
	
	@Test
	public void testDBCP01() {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//1.构建数据源对象
			BasicDataSource dataSource = new BasicDataSource();
			
			//连的是什么类型的数据库,访问的是哪个数据库,用户名,密码.
			dataSource.setPassword("975864");
			dataSource.setUsername("root");
			dataSource.setUrl("jdbc:mysql://localhost:3306/bank");
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			//2.得到连接对象
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
