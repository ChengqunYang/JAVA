package tx.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ����ת�˵Ļ���
 * @author DELL
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx2.xml")
public class TxDemo1 {
	
	@Resource(name="accountService")
	private AccountService accountService;
	@Test
	public void demo1(){
		accountService.transfer("Сˮ", "����", 200d);
	}
	
}