package spring.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����ע��ķ�ʽ
 * @author DELL
 *
 */
public class SpringDemo3 {
	@Test
	/**
	 * ���췽����ʽ������ע��
	 */
	public void demo1(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car)applicationContext.getBean("car");
		System.out.println(car);
	}
	
	@Test
	/**
	 * set������ʽ������ע��
	 */
	public void demo2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car2 car2 = (Car2)applicationContext.getBean("car2");
		System.out.println(car2);
	}
	
	
	@Test
	/**
	 * set����ע��������͵�ֵ
	 */
	public void demo3(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee)applicationContext.getBean("employee");
		System.out.println(employee);
	}
}