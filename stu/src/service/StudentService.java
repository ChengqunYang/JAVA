package service;

import java.sql.SQLException;
import java.util.List;

import domain.PageBean;
import domain.Student;

public interface StudentService {
	
	/**
	 * 查询当页的page
	 * @param currentPage
	 * @return
	 * @throws SQLException
	 */
	 PageBean findStudentByPage(int currentPage)throws SQLException;
	
	/**
	 * 这是学生的业务处理规则
	 * @return List<Student>
	 */
	/*
	 * Dao只针对单一的逻辑,数据操作层面
	 * Service 是业务的层面
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
	
}
