package myJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_CRUD {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//��ѯ
			//1.��ȡ���Ӷ���
			conn = JDBCUtil.getConn();
			//2.�������Ӷ���õ�Statement
			st = conn.createStatement();
			//3.ִ��sql���,�õ����ص�resultSet
			String sql = "select * from student";
			rs = st.executeQuery(sql);
			//4.���������
			while(rs.next()){
				String name = rs.getString("sname");
				int age = rs.getInt("age");
				System.out.println("name   "+ name + "   age "+age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.release(rs, st, conn);
		}
		
	}
}
