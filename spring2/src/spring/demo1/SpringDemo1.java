package spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring的IOC的注解开发的测试类
 * @author DELL
 *
 */
public class SpringDemo1 {
	
	@Test
	//传统方式
	public void demo1(){
		UserDaoImpl userDao = new UserDaoImpl();
		userDao.setName("张三");
		userDao.save();
	}
	
	@Test
	//SpringIOC的注解方式
	public void demo2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.save();
	}
	
	@Test
	//SpringIOC的注解方式
	public void demo3(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.save();
	}
}
