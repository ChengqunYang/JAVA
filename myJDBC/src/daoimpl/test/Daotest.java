package daoimpl.test;

import org.junit.Test;

import dao.impl.DaoImpl;
import dao.inter.UserDao;
/**
	1.�з���ֵ�ķ�������ֱ�Ӳ���
	
	2.�������ķ�������ֱ�Ӳ���
	
	3.����Ȩ����public���µķ�������ֱ�Ӳ���
	
	4.static��̬��������ֱ�Ӳ���
	
	5.���ܸ�����ǰ�ĸ�����������һ���ķ������@Testע�⣬����ִ������@Test�����ķ���Ҳ�����initializationerror��ʼ���쳣
 */
public class Daotest {
	@Test
	public void testFindAll(){
		UserDao dao = new DaoImpl();
		dao.findAll();
	}
	@Test
	public void testLogin(){
		UserDao dao = new DaoImpl();
		dao.login("zhangsan", "123");
	}
	@Test
	public void testInsert(){
		UserDao dao = new DaoImpl();
		dao.insert(3, "wangwu", "789", "1871111000");
	}
	@Test
	public void TestDelete(){
		UserDao dao = new DaoImpl();
		dao.delete(3);
	}
	@Test
	public void testUpdate() {
		UserDao dao = new DaoImpl();
		dao.update(1, "zhangsan");
		
	}
	
}
