package dao;

import java.sql.SQLException;

public interface UserDao {
	/**
	 * 用于检测用户名是否存在
	 * @param username
	 * @return true: 存在   false:不存在
	 * @throws SQLException 
	 */
	boolean checkUserName(String username) throws SQLException;
}
