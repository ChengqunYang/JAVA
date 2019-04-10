package service;

import java.sql.SQLException;
import java.util.List;

import domain.Student;

public interface StudentService {
	
	
	/**
	 * ����ѧ����ҵ�������
	 * @return List<Student>
	 */
	/*
	 * Daoֻ��Ե�һ���߼�,���ݲ�������
	 * Service ��ҵ��Ĳ���
	 */
	List<Student> findAll() throws SQLException;
	/**
	 * ���ѧ��
	 * @param student ��Ҫ��ӵ����ݿ��ѧ������
	 * @throws SQLException
	 */
	void insert(Student student) throws SQLException;
}
