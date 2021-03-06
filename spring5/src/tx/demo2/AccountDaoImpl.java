package tx.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 这是转账的Dao的实现
 * @author DELL
 *
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

	@Override
	public void outMoney(String from, Double money) {
		this.getJdbcTemplate().update("update account set money = money - ? where name = ?", money,from);
	}

	@Override
	public void inMoney(String to, Double money) {
		this.getJdbcTemplate().update("update account set money = money + ? where name = ?", money,to);
	}

}
