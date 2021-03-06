package spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
	
	@Test
	/**
	 * 生命周期的配置
	 */
	public void demo1() {
		//加载配置文件,创建工厂
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext会在加载配置文件的时候就生成对象   所以这时初始化方法已经执行了
		//工厂通过getBean方法来生成对象（返回的是object类型的所以需要强转）
		CustomerDao customerDao = (CustomerDao) applicationContext.getBean("CustomerDao"); 
		customerDao.save();
		applicationContext.close();
	}
	
	
	
	
	@Test
	/**
	 * Bean的作用范围的配置
	 */
	public void demo2() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao1 = (CustomerDao) applicationContext.getBean("CustomerDao"); 
		CustomerDao customerDao2 = (CustomerDao) applicationContext.getBean("CustomerDao"); 
		System.out.println(customerDao1==customerDao2);   //true默认情况下是单例的（scope = "singleton"）  如果设置为prototype则为多例模式
	//	customerDao.save();
		applicationContext.close();
	}
	
}
