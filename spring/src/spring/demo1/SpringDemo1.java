package spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 的入门
 * @author DELL
 *
 */
public class SpringDemo1 {
	
	@Test
	/**
	 * 传统方法的调用
	 */
	public void demo1() {
		UserDao userDao = new UserDaoImpl();
		//此处是具体实现了UserDaoImpl类,如果要改变底层实现,需要修改代码,所以下面我们采用Spring的方式
		userDao.save();
	}
	
	@Test
	/**
	 * Spring方式的调用
	 */
	public void demo2() {
		//创建Spring的工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("UserDao");
		//此处是到配置文件中去寻找到底实现的是那个,所以不需要修改代码,只需要修改配置文件即可
		userDao.save();
	}
}
