package tx.demo3;

/**
 * ת�˵�DAO�Ľӿ�
 * @author DELL
 *
 */
public interface AccountDao {
	public void outMoney(String from,Double money);
	public void inMoney(String to,Double money);
}
