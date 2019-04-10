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
			/*//ע������   java4.0�汾����Բ�ע��,��getconnection�����л��Զ�ע������
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Class.forName("com.mysql.jdbc.Driver");
			//��������
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","975864");*/
			//���������ݿ�򽻵��Ķ���statement
			st = conn.createStatement();
			//ִ�в�ѯ
			String sql = "select * from student";
			rs = st.executeQuery(sql);
			//��ʾ����
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
