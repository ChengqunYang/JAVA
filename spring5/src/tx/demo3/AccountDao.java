package tx.demo3;

/**
 * 转账的DAO的接口
 * @author DELL
 *
 */
public interface AccountDao {
	public void outMoney(String from,Double money);
	public void inMoney(String to,Double money);
}
