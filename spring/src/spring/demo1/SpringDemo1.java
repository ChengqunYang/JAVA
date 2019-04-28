package spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring ������
 * @author DELL
 *
 */
public class SpringDemo1 {
	
	@Test
	/**
	 * ��ͳ�����ĵ���
	 */
	public void demo1() {
		UserDao userDao = new UserDaoImpl();
		//�˴��Ǿ���ʵ����UserDaoImpl��,���Ҫ�ı�ײ�ʵ��,��Ҫ�޸Ĵ���,�����������ǲ���Spring�ķ�ʽ
		userDao.save();
	}
	
	@Test
	/**
	 * Spring��ʽ�ĵ���
	 */
	public void demo2() {
		//����Spring�Ĺ���
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("UserDao");
		//�˴��ǵ������ļ���ȥѰ�ҵ���ʵ�ֵ����Ǹ�,���Բ���Ҫ�޸Ĵ���,ֻ��Ҫ�޸������ļ�����
		userDao.save();
	}
}