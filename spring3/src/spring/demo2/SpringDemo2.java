package spring.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AOP������
 * @author DELL
 *
 */
//�ò���������Spring���Ի���
@RunWith(SpringJUnit4ClassRunner.class)
//���������ļ�
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo2 {
	//ע��������͵�����
	@Resource(name="productDao")
	private ProductDao productDao;
	
	@Test
	public void demo1(){
		productDao.save();
		productDao.update();
		productDao.find();
		productDao.delete();
	}
}