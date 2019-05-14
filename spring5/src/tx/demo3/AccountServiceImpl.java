package tx.demo3;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * ת�˵�ҵ��ʵ��
 * @author DELL
 *
 */
@Transactional
public class AccountServiceImpl implements AccountService{
	
	//ע��DAO
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	@Override
	/**
	 * from:ת���˺�
	 * to:ת���˺�
	 * money:ת�˽��
	 */
	public void transfer(String from, String to, Double money) {
				accountDao.outMoney(from,money);
				int d = 1/0;
				accountDao.inMoney(to, money);
	}
} 

