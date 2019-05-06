package spring.demo1;

import org.junit.Test;

public class SpringDemo1 {
	
	@Test
	/**
	 * cglib�Ĳ���
	 */
	public void demo1(){
		CustomerDao customerDao = new CustomerDao();
		
		CustomerDao proxy = new CglibProxy(customerDao).createProxy();
		proxy.save();
		proxy.update();
		proxy.find();
		proxy.delete();
	}

}
