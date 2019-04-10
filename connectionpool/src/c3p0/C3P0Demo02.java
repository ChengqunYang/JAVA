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
			//1.����dataSource
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			
			
			//�Զ���ȡxml�ļ�����֪���������ĸ����ݿ�.(Ĭ�϶�ȡxml�е�default-config��֧)
			
			
			//2.�õ����Ӷ���
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
