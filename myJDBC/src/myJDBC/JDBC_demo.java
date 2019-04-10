package myJDBC;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC_demo {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			
			conn = JDBCUtil.getConn();
			/*//注册驱动   java4.0版本后可以不注册,在getconnection函数中会自动注册驱动
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","975864");*/
			//创建和数据库打交道的对象statement
			st = conn.createStatement();
			//执行查询
			String sql = "select * from student";
			rs = st.executeQuery(sql);
			//显示数据
			while(rs.next()){
				int id = rs.getInt("sid");
				String name = rs.getString("sname");
				int sex = rs.getInt("sex");
				int age = rs.getInt("age");
				int score = rs.getInt("chengji");
				System.out.println("id = "+ id + "   name = "+name);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			JDBCUtil.release(rs, st, conn);
		}
	}
}
