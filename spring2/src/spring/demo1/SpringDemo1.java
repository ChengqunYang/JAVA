package spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring��IOC��ע�⿪���Ĳ�����
 * @author DELL
 *
 */
public class SpringDemo1 {
	
	@Test
	//��ͳ��ʽ
	public void demo1(){
		UserDaoImpl userDao = new UserDaoImpl();
		userDao.setName("����");
		userDao.save();
	}
	
	@Test
	//SpringIOC��ע�ⷽʽ
	public void demo2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.save();
	}
	
	@Test
	//SpringIOC��ע�ⷽʽ
	public void demo3(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.save();
	}
}