package service;

import java.sql.SQLException;
import java.util.List;

import domain.Student;

public interface StudentService {
	
	
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
}
