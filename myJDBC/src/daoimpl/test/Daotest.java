package daoimpl.test;

import org.junit.Test;

import dao.impl.DaoImpl;
import dao.inter.UserDao;
/**
	1.有返回值的方法不能直接测试
	
	2.带参数的方法不能直接测试
	
	3.访问权限在public以下的方法不能直接测试
	
	4.static静态方法不能直接测试
	
	5.不能给出现前四个条件中任意一个的方法添加@Test注解，否则执行满足@Test条件的方法也会出现initializationerror初始化异常
 */
public class Daotest {
	@Test
	public void testFindAll(){
		UserDao dao = new DaoImpl();
		dao.findAll();
	}
	@Test
	public void testLogin(){
		UserDao dao = new DaoImpl();
		dao.login("zhangsan", "123");
	}
	@Test
	public void testInsert(){
		UserDao dao = new DaoImpl();
		dao.insert(3, "wangwu", "789", "1871111000");
	}
	@Test
	public void TestDelete(){
		UserDao dao = new DaoImpl();
		dao.delete(3);
	}
	@Test
	public void testUpdate() {
		UserDao dao = new DaoImpl();
		dao.update(1, "zhangsan");
		
	}
	
}
