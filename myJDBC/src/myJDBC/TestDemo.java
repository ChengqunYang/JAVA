package myJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/**	
 * ʹ��ִ�е�Ԫ����
 * @author DELL
 *
 */
public class TestDemo {
	@Test
	public void testQuery() {
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
				System.out.println("id = "+ id + "   name = "+name + "  score  "+ score);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			JDBCUtil.release(rs, st, conn);
		}
	}
@Test
	public void testInsert(){
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	try {
		//	1.�������Ӷ���
		conn = JDBCUtil.getConn();
		//	2.�������Ӷ���,�õ�statement
		st = conn.createStatement();
		//	3.ִ�����
		String sql = "insert into student values(5,'wangmazi',1,50,70)";
		//executeUpdate ����Ӱ�������.
		int result = st.executeUpdate(sql);
		if(result > 0){
			System.out.println("��ӳɹ�!");
		}else{
			System.out.println("���ʧ��!");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		JDBCUtil.release(st,conn);
	}
}
@Test
	public void testDelete(){
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	try {
		//	1.�������Ӷ���
		conn = JDBCUtil.getConn();
		//	2.�������Ӷ���,�õ�statement
		st = conn.createStatement();
		//	3.ִ�����
		String sql = "delete from student where sname = 'wangmazi";
		//executeUpdate ����Ӱ�������.
		int result = st.executeUpdate(sql);
		if(result > 0){
			System.out.println("ɾ���ɹ�!");
		}else{
			System.out.println("ɾ��ʧ��!");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		JDBCUtil.release(st,conn);
	}
	}
	@Test
	public void testUpdate(){
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	try {
		//	1.�������Ӷ���
		conn = JDBCUtil.getConn();
		//	2.�������Ӷ���,�õ�statement
		st = conn.createStatement();
		//	3.ִ�����
		String sql = "Update student set chengji = 90 where sname = 'zhaoliu'";
		//executeUpdate ����Ӱ�������.
		int result = st.executeUpdate(sql);
		if(result > 0){
			System.out.println("���³ɹ�!");
		}else{
			System.out.println("����ʧ��!");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		JDBCUtil.release(st,conn);
	}
	}
}

