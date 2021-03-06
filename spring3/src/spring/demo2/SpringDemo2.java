package spring.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AOP的入门
 * @author DELL
 *
 */
//让测试运行于Spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//导入配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo2 {
	//注入对象类型的属性
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
