package dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import dao.StudentDao;
import domain.Student;
import util.JDBCUtil;
import util.TextUtils;

/**
 * ����StudentDao��ʵ��,���ǰ�涨��Ĺ淶,д�������ʵ��
 * @author DELL
 *
 */
public class StudentDaoImpl implements StudentDao {

	/**
	 * ��ѯ���е�ѧ��
	 * @throws SQLException 
	 */
	@Override
	public List<Student> findAll() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());

		return runner.query("select * from stu", new BeanListHandler<Student>(Student.class));
		
	}

	@Override
	public void insert(Student student) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		
		runner.update("insert into stu values(null,?,?,?,?,?,?)",
				student.getSname(),
				student.getGender(),
				student.getPhone(),
				student.getBirthday(),
				student.getHobby(),
				student.getInfo()
				);
		
	}
	@Override
	public void delete(int sid) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("delete from stu where sid = ?",sid);
		
		
	}

	@Override
	public Student findStudentById(int sid) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		return runner.query("select * from stu where sid = ?", new BeanHandler<Student>(Student.class),sid);
	}

	@Override
	public void update(Student student) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		runner.update("update stu set sname=?, gender=?, phone=?, birthday=?, hobby=?, info=? where sid = ?",
				student.getSname(),
				student.getGender(),
				student.getPhone(),
				student.getBirthday(),
				student.getHobby(),
				student.getInfo(),
				student.getSid());
	}

	@Override
	public List<Student> searchStudent(String sname, String sgender) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		/*
		 * ���ֻ������,select * from stu where sname like ?
		 * ���ֻ���Ա�,select * from stu where gender = ?
		 * �������������,select * from stu where sname like ? and gender=?
		 * 
		 * ���������û�����ѯ����
		 * 
		*/	
		String sql = "select * from stu where 1=1 ";
		List<String> list = new ArrayList<String>(); 
	
		//�ж���û������
		if(!TextUtils.isEmpty(sname)){
			sql = sql + "and sname like ?";
			list.add("%"+sname+"%");
		}
		//�ж���û���Ա�
		if(!TextUtils.isEmpty(sgender)){
			sql = sql + "and gender = ?";
			list.add(sgender);
		}
		return runner.query(sql, new BeanListHandler<Student>(Student.class),list.toArray());
	}

	@Override
	public List<Student> findStudentByPage(int currentPage) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		//��һ���ʺŴ���һҳ���ض�������¼  �ڶ����ʺ� ����ǰ��Ķ�������¼
		//��һҳ: 5, 0   (1-1)*5
		//�ڶ�ҳ: 5, 5	 (2-1)*5
		//����ҳ: 5,10	 (3-1)*5
		return runner.query("select * from stu limit ? offset ?", new BeanListHandler<>(Student.class),PAGE_SIZE,(currentPage-1)*PAGE_SIZE);
		
	}

	@Override
	public int findCount() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		//���ڴ���ƽ��ֵ,�ܵĸ���
		Long result = (long)runner.query("select count(*)from stu", new ScalarHandler());  
		
		return result.intValue();
		
		
	}

}