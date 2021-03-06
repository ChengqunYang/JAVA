package spring.demo2;

public class CustomerDaoImpl implements CustomerDao{
	/**
	 * 类的初始化方法
	 */
	public void setup() {
		System.out.println("CustomerDaoImpl被初始化了");
	}
	
	@Override
	public void save() {
		System.out.println("CustomerDaoImpl的save方法执行了");
	}
	
	/**
	 * 类的销毁方法
	 */
	public void destroy() {
		System.out.println("CustomerDaoImpl被销毁了");
	}
}
