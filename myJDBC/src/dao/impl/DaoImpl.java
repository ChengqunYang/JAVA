package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.inter.UserDao;
import myJDBC.JDBCUtil;

public class DaoImpl implements UserDao{
	@Override
	public void findAll() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.获取连接对象
			conn = JDBCUtil.getConn();
			//2.获取Statement
			st = conn.createStatement();
			//3.执行查询
			String sql = "select * from user";
			rs  = st.executeQuery(sql);
			while(rs.next()){
				String userName  = rs.getString("username");
				int userid = rs.getInt("uid");
				int password = rs.getInt("password");
				int phone = rs .getInt("phone");
				System.out.println(userName + userid +password +phone);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(rs, st, conn);
			
		}
		
	}
	/*@Override
	public void login(String username, String password) {
		//相当于有条件的查询   createStatement
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.获取连接对象
			conn = JDBCUtil.getConn();
			//2.获取Statement
			st = (Statement) conn.createStatement();
			//3.执行查询
			String sql = "select * from user where username='"+ username +"' and password='"+ password +"'";
			rs  = st.executeQuery(sql);
			if(rs.next()){
				System.out.println("登录成功");
			}else{
				System.out.println("登录失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(rs, st, conn);
			
		}
	}
	*/
	@Override
	public void login(String username, String password) {
		//相当于有条件的查询   prepareStatement
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.获取连接对象
			conn = JDBCUtil.getConn();
			//2.获取Statement
			String sql1 = "select * from user where username=? and password= ?";
			//预先对sql语句执行语法的校验,?对应的内容,后面不管传递什么进来都把他看成是字符串
			PreparedStatement ps = conn.prepareStatement(sql1);
			//问号对应的索引从1开始
			ps.setString(1, username);
			ps.setString(2, password);
			//3.执行查询
			rs = ps.executeQuery();
			if(rs.next()){
				System.out.println("登录成功");
			}else{
				System.out.println("登录失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(rs, st, conn);
			
		}
	}

	@Override
	public void insert( int uid,String username, String password,String phone) {
		//相当于有条件的查询
		Connection conn = null;
		Statement st = null;
		try {
			//1.获取连接对象
			conn = JDBCUtil.getConn();
			//2.获取Statement
			String sql = "insert into user values(?,?,?,?)";
			//预先对sql语句执行语法的校验,?对应的内容,后面不管传递什么进来都把他看成是字符串
			PreparedStatement ps = conn.prepareStatement(sql);
			//问号对应的索引从1开始
			ps.setInt(1,uid);
			ps.setString(2,username);
			ps.setString(3,password);
			ps.setString(4,phone);
			//3.执行查询
			int result= ps.executeUpdate();
			if(result>0){
				System.out.println("插入成功");
			}else{
				System.out.println("插入失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(st, conn);
			
		}		

	}

	@Override
	public void delete(int uid) {
		//相当于有条件的查询
		Connection conn = null;
		Statement st = null;
		try {
			//1.获取连接对象
			conn = JDBCUtil.getConn();
			//2.获取Statement
			String sql = "delete from user where uid = ?";
			//预先对sql语句执行语法的校验,?对应的内容,后面不管传递什么进来都把他看成是字符串
			PreparedStatement ps = conn.prepareStatement(sql);
			//问号对应的索引从1开始
			ps.setInt(1,uid);
			//3.执行查询
			int result= ps.executeUpdate();
			if(result>0){
				System.out.println("删除成功");
			}else{
				System.out.println("删除失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(st, conn);
			
		}		
	}
	@Override
	public void update(int uid, String username) {
		Connection conn = null;
		Statement st = null;
		try {
			//1.获取连接对象
			conn = JDBCUtil.getConn();
			//2.获取Statement
			String sql = "update user set username = ? where uid = ?";
			//预先对sql语句执行语法的校验,?对应的内容,后面不管传递什么进来都把他看成是字符串
			PreparedStatement ps = conn.prepareStatement(sql);
			//问号对应的索引从1开始
			ps.setString(1, username);
			ps.setInt(2,uid);
			//3.执行查询
			int result= ps.executeUpdate();
			if(result>0){
				System.out.println("更新成功");
			}else{
				System.out.println("更新失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(st, conn);
			
		}		
		
	}
}
