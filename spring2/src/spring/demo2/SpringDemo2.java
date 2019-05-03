package spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
	
	@Test
	public void demo1(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
		System.out.println(customerService);
		customerService.save();
		
		CustomerService customerService2 = (CustomerService) applicationContext.getBean("customerService");
		System.out.println(customerService2);
		customerService2.save();
		applicationContext.close();
	}
}
