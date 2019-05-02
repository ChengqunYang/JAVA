package spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
	
	@Test
	/**
	 * �������ڵ�����
	 */
	public void demo1() {
		//���������ļ�,��������
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext���ڼ��������ļ���ʱ������ɶ���   ������ʱ��ʼ�������Ѿ�ִ����
		//����ͨ��getBean���������ɶ��󣨷��ص���object���͵�������Ҫǿת��
		CustomerDao customerDao = (CustomerDao) applicationContext.getBean("CustomerDao"); 
		customerDao.save();
		applicationContext.close();
	}
	
	
	
	
	@Test
	/**
	 * Bean�����÷�Χ������
	 */
	public void demo2() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao1 = (CustomerDao) applicationContext.getBean("CustomerDao"); 
		CustomerDao customerDao2 = (CustomerDao) applicationContext.getBean("CustomerDao"); 
		System.out.println(customerDao1==customerDao2);   //trueĬ��������ǵ����ģ�scope = "singleton"��  �������Ϊprototype��Ϊ����ģʽ
	//	customerDao.save();
		applicationContext.close();
	}
	
}