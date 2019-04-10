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
			//查询
			//1.获取连接对象
			conn = JDBCUtil.getConn();
			//2.根据连接对象得到Statement
			st = conn.createStatement();
			//3.执行sql语句,得到返回的resultSet
			String sql = "select * from student";
			rs = st.executeQuery(sql);
			//4.遍历结果集
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
