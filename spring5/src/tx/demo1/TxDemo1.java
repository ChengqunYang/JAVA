package tx.demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试转账的环境
 * @author DELL
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx.xml")
public class TxDemo1 {
	
	@Resource(name="accountService")
	private AccountService accountService;
	@Test
	public void demo1(){
		accountService.transfer("小水", "李四", 200d);
	}
	
}
