package dao;

import java.sql.SQLException;
import java.util.List;

import domain.Student;

/**
 * 这是针对学生表的数据访问
 * @author DELL
 *
 */
public interface StudentDao {
	
	
	/**
	 * 查询所有的学生
	 * @return List<Student>
	 */
	List<Student> findAll() throws SQLException;
	/**
	 * 添加学生
	 * @param student 需要添加到数据库的学生对象
	 * @throws SQLException
	 */
	void insert(Student student) throws SQLException;
}
