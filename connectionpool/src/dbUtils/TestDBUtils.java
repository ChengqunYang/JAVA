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
		//dbUtils只是帮我们简化了crud的操作,但是连接的创建和获取操作不在考虑范围内
		QueryRunner queryRunner = new QueryRunner(dataSource);
		//针对增加
		//queryRunner.update("insert into account values (null, ? , ?)","aa",100);
		//删除
		//queryRunner.update("delete from account where id = ?", 6);
		//更新
		//queryRunner.update("update account set money = ? where id = ?",100000, 7);
		
		
		
		//去执行查询,查询到的数据还是在那个resultset里面,然后调用handle方法,让用户动手去封装.	
	/*	Account account = queryRunner.query("select * from account where id = ?", new ResultSetHandler<Account>() {

			@Override
			public Account handle(ResultSet rs) throws SQLException {
				Account account = new Account();
				while(rs.next()){
					String name = rs.getString("name");
					int money = rs.getInt("money");
					//将获取到的数据存放到我们事先定义好的类中
					account.setName(name);
					account.setMoney(money);
				}
				return account;
			}
		},6);
		System.out.println(account.toString());
		*/
		
		
		//查询单个对象
	/*	Account account = queryRunner.query("select * from account where id = ?",
				new BeanHandler<Account>(Account.class),4);
		System.out.println(account.toString());
	*/
		
		
		//查询多个对象
		List<Account> list = queryRunner.query("select * from account", new BeanListHandler<Account>(Account.class));
		for(Account account:list) {
			System.out.println(account.toString());
		}
	}
}
