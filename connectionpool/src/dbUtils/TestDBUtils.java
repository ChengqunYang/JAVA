package dbUtils;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import domain.Account;

/**
 * QueryRunner queryRunner = new QueryRunner(dataSource);
 * queryRunner.update();
 * queryRunner.query();
 * @author DELL
 *
 */
public class TestDBUtils {
	@Test
	public void testInsert() throws SQLException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		//dbUtilsֻ�ǰ����Ǽ���crud�Ĳ���,�������ӵĴ����ͻ�ȡ�������ڿ��Ƿ�Χ��
		QueryRunner queryRunner = new QueryRunner(dataSource);
		//�������
		//queryRunner.update("insert into account values (null, ? , ?)","aa",100);
		//ɾ��
		//queryRunner.update("delete from account where id = ?", 6);
		//����
		//queryRunner.update("update account set money = ? where id = ?",100000, 7);
		
		
		
		//ȥִ�в�ѯ,��ѯ�������ݻ������Ǹ�resultset����,Ȼ�����handle����,���û�����ȥ��װ.	
	/*	Account account = queryRunner.query("select * from account where id = ?", new ResultSetHandler<Account>() {

			@Override
			public Account handle(ResultSet rs) throws SQLException {
				Account account = new Account();
				while(rs.next()){
					String name = rs.getString("name");
					int money = rs.getInt("money");
					//����ȡ�������ݴ�ŵ��������ȶ���õ�����
					account.setName(name);
					account.setMoney(money);
				}
				return account;
			}
		},6);
		System.out.println(account.toString());
		*/
		
		
		//��ѯ��������
	/*	Account account = queryRunner.query("select * from account where id = ?",
				new BeanHandler<Account>(Account.class),4);
		System.out.println(account.toString());
	*/
		
		
		//��ѯ�������
		List<Account> list = queryRunner.query("select * from account", new BeanListHandler<Account>(Account.class));
		for(Account account:list) {
			System.out.println(account.toString());
		}
	}
}
