package dao;

import java.sql.SQLException;

public interface UserDao {
	/**
	 * ���ڼ���û����Ƿ����
	 * @param username
	 * @return true: ����   false:������
	 * @throws SQLException 
	 */
	boolean checkUserName(String username) throws SQLException;
}
