package tx.demo1;

/**
 * 转账的业务层的接口
 * transaction:事务
 * @author DELL
 *
 */
public interface AccountService {
	
	public void transfer(String from,String to,Double money);
}
