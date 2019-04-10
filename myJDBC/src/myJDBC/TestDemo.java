package myJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/**	
 * 使用执行单元测试
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
		//	1.建立连接对象
		conn = JDBCUtil.getConn();
		//	2.根据连接对象,得到statement
		st = conn.createStatement();
		//	3.执行添加
		String sql = "insert into student values(5,'wangmazi',1,50,70)";
		//executeUpdate 返回影响的列数.
		int result = st.executeUpdate(sql);
		if(result > 0){
			System.out.println("添加成功!");
		}else{
			System.out.println("添加失败!");
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
		//	1.建立连接对象
		conn = JDBCUtil.getConn();
		//	2.根据连接对象,得到statement
		st = conn.createStatement();
		//	3.执行添加
		String sql = "delete from student where sname = 'wangmazi";
		//executeUpdate 返回影响的列数.
		int result = st.executeUpdate(sql);
		if(result > 0){
			System.out.println("删除成功!");
		}else{
			System.out.println("删除失败!");
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
		//	1.建立连接对象
		conn = JDBCUtil.getConn();
		//	2.根据连接对象,得到statement
		st = conn.createStatement();
		//	3.执行添加
		String sql = "Update student set chengji = 90 where sname = 'zhaoliu'";
		//executeUpdate 返回影响的列数.
		int result = st.executeUpdate(sql);
		if(result > 0){
			System.out.println("更新成功!");
		}else{
			System.out.println("更新失败!");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		JDBCUtil.release(st,conn);
	}
	}
}

