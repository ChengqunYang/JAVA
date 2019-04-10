package dbcp;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import jdbc.util.JDBCUtil;

public class DBCPDemo02 {
	@Test
	public void testDBCP02(){
		Connection conn = null;
		PreparedStatement ps = null;
		try {
		BasicDataSourceFactory factory = new BasicDataSourceFactory();
		Properties properties = new Properties();
		InputStream is = new FileInputStream("src//dbcpconfig.properties");
		properties.load(is);
		DataSource dataSource = factory.createDataSource(properties);
			//2.得到连接对象
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
