package jdbc.demo1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import jdbc.domain.Account;

/**
 * JDBCģ������ݿ����ӳ����õ�ʹ��
 * @author DELL
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcDemo2 {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemple;
	//��ɾ�ĵĲ�����ͬ
	@Test
	//�������
	public void demo1(){
		jdbcTemple.update("insert into account values (null,?,?)", "Сˮ",1000d);
	}
	@Test
	//�޸Ĳ���
	public void demo2(){
		jdbcTemple.update("update account set name=?,money=? where id=?","����",2000d,5);
	}
	@Test
	//ɾ������
	public void demo3(){
		jdbcTemple.update("delete from account where id=?",6);
	}
	@Test
	//��ѯ����:��ѯ����
	public void demo4(){
		String name = jdbcTemple.queryForObject("select name from account where id=?", String.class,5);
		System.out.println(name);
	}
	@Test
	//��ѯ����:��ѯ��¼������
	public void demo5(){
		Long count = jdbcTemple.queryForObject("select count(*) from account", Long.class);
		System.out.println(count);
	}
	@Test
	//��ѯ����:��ѯһ����¼��װ��һ��������
	public void demo6(){
		Account account = jdbcTemple.queryForObject("select * from account where id=?", new MyRowMapper(), 5);
		System.out.println(account);
	}
	@Test
	//��ѯ����:��ѯ������¼��װ��һ��List������
	public void demo7(){
		List<Account> list = jdbcTemple.query("select * from account ", new MyRowMapper());
		for (Account account : list) {
			System.out.println(account);
		}
	}
	
	class MyRowMapper implements RowMapper<Account>{

		@Override
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			Account account = new Account();
			//ͨ��account���Ե�set���������ò�ѯ��������,��װ��һ��account���󲢷���
			account.setId(rs.getInt("id"));
			account.setName(rs.getString("name"));
			account.setMoney(rs.getDouble("money"));
			return account;
		}
		
	}
}