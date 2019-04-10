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
			//1.��ȡ���Ӷ���
			conn = JDBCUtil.getConn();
			//2.��ȡStatement
			st = conn.createStatement();
			//3.ִ�в�ѯ
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
		//�൱���������Ĳ�ѯ   createStatement
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.��ȡ���Ӷ���
			conn = JDBCUtil.getConn();
			//2.��ȡStatement
			st = (Statement) conn.createStatement();
			//3.ִ�в�ѯ
			String sql = "select * from user where username='"+ username +"' and password='"+ password +"'";
			rs  = st.executeQuery(sql);
			if(rs.next()){
				System.out.println("��¼�ɹ�");
			}else{
				System.out.println("��¼ʧ��");
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
		//�൱���������Ĳ�ѯ   prepareStatement
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.��ȡ���Ӷ���
			conn = JDBCUtil.getConn();
			//2.��ȡStatement
			String sql1 = "select * from user where username=? and password= ?";
			//Ԥ�ȶ�sql���ִ���﷨��У��,?��Ӧ������,���治�ܴ���ʲô�����������������ַ���
			PreparedStatement ps = conn.prepareStatement(sql1);
			//�ʺŶ�Ӧ��������1��ʼ
			ps.setString(1, username);
			ps.setString(2, password);
			//3.ִ�в�ѯ
			rs = ps.executeQuery();
			if(rs.next()){
				System.out.println("��¼�ɹ�");
			}else{
				System.out.println("��¼ʧ��");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(rs, st, conn);
			
		}
	}

	@Override
	public void insert( int uid,String username, String password,String phone) {
		//�൱���������Ĳ�ѯ
		Connection conn = null;
		Statement st = null;
		try {
			//1.��ȡ���Ӷ���
			conn = JDBCUtil.getConn();
			//2.��ȡStatement
			String sql = "insert into user values(?,?,?,?)";
			//Ԥ�ȶ�sql���ִ���﷨��У��,?��Ӧ������,���治�ܴ���ʲô�����������������ַ���
			PreparedStatement ps = conn.prepareStatement(sql);
			//�ʺŶ�Ӧ��������1��ʼ
			ps.setInt(1,uid);
			ps.setString(2,username);
			ps.setString(3,password);
			ps.setString(4,phone);
			//3.ִ�в�ѯ
			int result= ps.executeUpdate();
			if(result>0){
				System.out.println("����ɹ�");
			}else{
				System.out.println("����ʧ��");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(st, conn);
			
		}		

	}

	@Override
	public void delete(int uid) {
		//�൱���������Ĳ�ѯ
		Connection conn = null;
		Statement st = null;
		try {
			//1.��ȡ���Ӷ���
			conn = JDBCUtil.getConn();
			//2.��ȡStatement
			String sql = "delete from user where uid = ?";
			//Ԥ�ȶ�sql���ִ���﷨��У��,?��Ӧ������,���治�ܴ���ʲô�����������������ַ���
			PreparedStatement ps = conn.prepareStatement(sql);
			//�ʺŶ�Ӧ��������1��ʼ
			ps.setInt(1,uid);
			//3.ִ�в�ѯ
			int result= ps.executeUpdate();
			if(result>0){
				System.out.println("ɾ���ɹ�");
			}else{
				System.out.println("ɾ��ʧ��");
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
			//1.��ȡ���Ӷ���
			conn = JDBCUtil.getConn();
			//2.��ȡStatement
			String sql = "update user set username = ? where uid = ?";
			//Ԥ�ȶ�sql���ִ���﷨��У��,?��Ӧ������,���治�ܴ���ʲô�����������������ַ���
			PreparedStatement ps = conn.prepareStatement(sql);
			//�ʺŶ�Ӧ��������1��ʼ
			ps.setString(1, username);
			ps.setInt(2,uid);
			//3.ִ�в�ѯ
			int result= ps.executeUpdate();
			if(result>0){
				System.out.println("���³ɹ�");
			}else{
				System.out.println("����ʧ��");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(st, conn);
			
		}		
		
	}
}
