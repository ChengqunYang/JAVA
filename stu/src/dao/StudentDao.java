package dao;

import java.sql.SQLException;
import java.util.List;

import domain.Student;

/**
 * �������ѧ��������ݷ���
 * @author DELL
 *
 */
public interface StudentDao {
	
	
	/**
	 * ��ѯ���е�ѧ��
	 * @return List<Student>
	 */
	List<Student> findAll() throws SQLException;
	/**
	 * ���ѧ��
	 * @param student ��Ҫ��ӵ����ݿ��ѧ������
	 * @throws SQLException
	 */
	void insert(Student student) throws SQLException;
}
