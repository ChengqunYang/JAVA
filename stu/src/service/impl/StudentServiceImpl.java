package service.impl;

import java.sql.SQLException;
import java.util.List;

import dao.StudentDao;
import domain.Student;
import impl.StudentDaoImpl;
import service.StudentService;

public class StudentServiceImpl implements StudentService{
/**
 * 这是学生业务实现
 */
	@Override
	public List<Student> findAll() throws SQLException {
		StudentDao dao =new StudentDaoImpl();
		return dao.findAll();
	}
/**
 * 调用StudentDao的insert方法来实现
 */
	@Override
	public void insert(Student student) throws SQLException {
		
		StudentDao dao = new StudentDaoImpl();
		dao.insert(student);
	}

}
