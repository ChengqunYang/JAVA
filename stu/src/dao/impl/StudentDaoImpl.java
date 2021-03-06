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
 * 这是StudentDao的实现,针对前面定义的规范,写出具体的实现
 * @author DELL
 *
 */
public class StudentDaoImpl implements StudentDao {

	/**
	 * 查询所有的学生
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
		 * 如果只有姓名,select * from stu where sname like ?
		 * 如果只有性别,select * from stu where gender = ?
		 * 如果这里有两个,select * from stu where sname like ? and gender=?
		 * 
		 * 如果两个都没有则查询所有
		 * 
		*/	
		String sql = "select * from stu where 1=1 ";
		List<String> list = new ArrayList<String>(); 
	
		//判断有没有姓名
		if(!TextUtils.isEmpty(sname)){
			sql = sql + "and sname like ?";
			list.add("%"+sname+"%");
		}
		//判断有没有性别
		if(!TextUtils.isEmpty(sgender)){
			sql = sql + "and gender = ?";
			list.add(sgender);
		}
		return runner.query(sql, new BeanListHandler<Student>(Student.class),list.toArray());
	}

	@Override
	public List<Student> findStudentByPage(int currentPage) throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		//第一个问号代表一页返回多少条记录  第二个问号 跳过前面的多少条记录
		//第一页: 5, 0   (1-1)*5
		//第二页: 5, 5	 (2-1)*5
		//第三页: 5,10	 (3-1)*5
		return runner.query("select * from stu limit ? offset ?", new BeanListHandler<>(Student.class),PAGE_SIZE,(currentPage-1)*PAGE_SIZE);
		
	}

	@Override
	public int findCount() throws SQLException {
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		//用于处理平均值,总的个数
		Long result = (long)runner.query("select count(*)from stu", new ScalarHandler());  
		
		return result.intValue();
		
		
	}

}