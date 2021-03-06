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
 * JDBC模板加数据库连接池配置的使用
 * @author DELL
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcDemo2 {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemple;
	//增删改的操作相同
	@Test
	//保存操作
	public void demo1(){
		jdbcTemple.update("insert into account values (null,?,?)", "小水",1000d);
	}
	@Test
	//修改操作
	public void demo2(){
		jdbcTemple.update("update account set name=?,money=? where id=?","李四",2000d,5);
	}
	@Test
	//删除操作
	public void demo3(){
		jdbcTemple.update("delete from account where id=?",6);
	}
	@Test
	//查询操作:查询名称
	public void demo4(){
		String name = jdbcTemple.queryForObject("select name from account where id=?", String.class,5);
		System.out.println(name);
	}
	@Test
	//查询操作:查询记录总条数
	public void demo5(){
		Long count = jdbcTemple.queryForObject("select count(*) from account", Long.class);
		System.out.println(count);
	}
	@Test
	//查询操作:查询一条记录封装到一个对象中
	public void demo6(){
		Account account = jdbcTemple.queryForObject("select * from account where id=?", new MyRowMapper(), 5);
		System.out.println(account);
	}
	@Test
	//查询操作:查询多条记录封装到一个List集合中
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
			//通过account属性的set方法里利用查询到的数据,封装成一个account对象并返回
			account.setId(rs.getInt("id"));
			account.setName(rs.getString("name"));
			account.setMoney(rs.getDouble("money"));
			return account;
		}
		
	}
}
