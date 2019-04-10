package c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import jdbc.util.JDBCUtil;

public class C3P0Demo02 {
	@Test
	public void testC3P0() {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//1.创建dataSource
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			
			
			//自动读取xml文件来得知操作的是哪个数据库.(默认读取xml中的default-config分支)
			
			
			//2.得到连接对象
			conn = dataSource.getConnection();
			String sql = "insert into account values(null,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "hhhh");
			ps.setInt(2, 5000);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.release(ps, conn);
		}
	}
}
