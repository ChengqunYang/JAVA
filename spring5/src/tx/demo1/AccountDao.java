package tx.demo1;

/**
 * ת�˵�DAO�Ľӿ�
 * @author DELL
 *
 */
public interface AccountDao {
	public void outMoney(String from,Double money);
	public void inMoney(String to,Double money);
}