package service.impl;

import java.sql.SQLException;
import java.util.List;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import domain.PageBean;
import domain.Student;
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
	
		
	@Override
	public void delete(int sid) throws SQLException {
		StudentDao dao = new StudentDaoImpl();
		dao.delete(sid);
	}
	@Override
	public Student findStudentById(int sid) throws SQLException {
		StudentDao dao = new StudentDaoImpl();
		return dao.findStudentById(sid);
	}
	@Override
	public void update(Student student) throws SQLException {
		StudentDao dao = new StudentDaoImpl();
		dao.update(student);
	}
	@Override
	public List<Student> searchStudent(String sname, String sgender) throws SQLException {
		return  new StudentDaoImpl().searchStudent(sname, sgender);
	}
	@Override
	public PageBean findStudentByPage(int currentPage) throws SQLException {
		//封装分页的当页数据
		PageBean<Student> pageBean = new PageBean<Student>();
		
		int pageSize = StudentDao.PAGE_SIZE;
		pageBean.setCurrentPage(currentPage);   //设置当前页
		pageBean.setPageSize(StudentDao.PAGE_SIZE);//设置每页的记录条数
		
		StudentDao dao = new StudentDaoImpl();
		List<Student> list = new StudentDaoImpl().findStudentByPage(currentPage);
		pageBean.setList(list); //这一页的学生数据
		
		//总的记录数,总的页数
		int count = dao.findCount();
		pageBean.setTotalSize(count);//设置总的记录数
		
		pageBean.setTotalPage(count % pageSize == 0 ? count/pageSize : (count/pageSize)+1);//设置总页数
		return pageBean;
	}

}
