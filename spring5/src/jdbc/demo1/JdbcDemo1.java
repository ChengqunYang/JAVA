package jdbc.demo1;


import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JDBCģ�������ʹ��
 * @author DELL
 *
 */
public class JdbcDemo1 {
	@Test
	public void demo1(){
		//�������ӳ�
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///springt");
		dataSource.setUsername("root");
		dataSource.setPassword("975864");
		//����jdbcģ��
		JdbcTemplate jdbcTemple = new JdbcTemplate(dataSource);
		//���²���
		jdbcTemple.update("insert into account values (null,?,?)", "С��",10000d);
	}
}