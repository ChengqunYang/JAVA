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
		UserDaoImpl userDao = new UserDaoImpl();
		//此处因为要使用UserDaoImpl的setname方法所以必须生成的是UserDaoImpl的对象
		//此处是具体实现了UserDaoImpl类,如果要改变底层实现,需要修改代码,所以下面我们采用Spring的方式
		userDao.setName("liming");  //传统方式需要给变量设置值，要使用setNmae()方法
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
		//此处使用di通过配置文件来自动设置对象的属性值
		userDao.save();
	}
}
