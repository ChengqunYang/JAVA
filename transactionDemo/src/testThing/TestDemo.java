package testThing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import jdbc.util.JDBCUtil;

public class TestDemo {
	@Test
	public void testTransaction() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getConn();
			//����ֻ�������
			//����,����Ĭ�Ͼ����Զ��ύ��
			
			//�ر��Զ��ύ��
			conn.setAutoCommit(false);   
			
			String sql = "update account set money = money - ? where id = ?";
			ps = conn.prepareStatement(sql);
			
			//��Ǯ,��IDΪ1 ��1000��Ǯ
			ps.setInt(1, 100);
			ps.setInt(2, 1);
			ps.executeUpdate();
			
			int a = 10/0;
			//��Ǯ,��IDΪ2 �ļ�1000��Ǯ
			ps.setInt(1, -100);
			ps.setInt(2, 2);
			ps.executeUpdate();
			
			//�ύ����
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				//�����쳣��ع�����
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			JDBCUtil.release(rs, ps, conn);
		}
	}
}
