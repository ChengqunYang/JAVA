package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import dao.UserDao;
import util.JDBCUtil;

public class UserDaoImpl  implements UserDao{

	public boolean checkUserName(String username) throws SQLException {
		
		QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
		
		String sql = "select count(*) from user where username = ?";
		
		Long result = (Long) runner.query(sql, new ScalarHandler(),username);
		return result > 0;
	}

}
