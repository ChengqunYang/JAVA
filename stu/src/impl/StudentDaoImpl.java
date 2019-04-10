package impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.StudentDao;
import domain.Student;
import util.JDBCUtil;

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

		return runner.query("select * from stu", new BeanListHandler<>(Student.class));
		
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
}
