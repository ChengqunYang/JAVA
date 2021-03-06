package jdbc.demo1;


import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JDBC模板的入门使用
 * @author DELL
 *
 */
public class JdbcDemo1 {
	@Test
	public void demo1(){
		//创建连接池
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///springt");
		dataSource.setUsername("root");
		dataSource.setPassword("975864");
		//创建jdbc模板
		JdbcTemplate jdbcTemple = new JdbcTemplate(dataSource);
		//更新操作
		jdbcTemple.update("insert into account values (null,?,?)", "小虎",10000d);
	}
}
