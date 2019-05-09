package tx.demo1;

public class AccountServiceImpl implements AccountService{
	
	//注入DAO
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	@Override
	/**
	 * from:转出账号
	 * to:转入账号
	 * money:转账金额
	 */
	public void transfer(String from, String to, Double money) {
		
		accountDao.outMoney(from,money);
		accountDao.inMoney(to, money);
	} 

}
