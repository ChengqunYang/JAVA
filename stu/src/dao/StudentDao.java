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
	
	int PAGE_SIZE = 5;   //一页显示多少条记录
	/**
	 * 查询当页的page
	 * @param currentPage
	 * @return
	 * @throws SQLException
	 */
	 List<Student> findStudentByPage(int currentPage)throws SQLException;
	
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
	
	/**
	 * 根据id删除学生
	 * @param sid
	 * @throws SQLException
	 */
	
	void delete(int sid)throws SQLException;
	
	/**
	 * 根据id查询单个学生对象
	 * @param sid
	 * @return
	 * @throws SQLException
	 */
	Student findStudentById(int sid) throws SQLException;
	
	/**
	 * 更新数据
	 * @param student    需要更新的学生数据
	 * @throws SQLException
	 */
	void  update (Student student)throws SQLException;
	
	/**
	 * 模糊查询,根据姓名或性别 或者两者兼有
	 * @param name
	 * @param sgender
	 * @return  集合
	 * @throws SQLException
	 */
	List<Student> searchStudent(String sname ,String sgender)throws SQLException;
	/**
	 * 查询学生总的记录数
	 * @return
	 * @throws SQLException
	 */
	int findCount() throws SQLException;
	
}
