package spring.demo2;

public class CustomerDaoImpl implements CustomerDao{
	/**
	 * ��ĳ�ʼ������
	 */
	public void setup() {
		System.out.println("CustomerDaoImpl����ʼ����");
	}
	
	@Override
	public void save() {
		System.out.println("CustomerDaoImpl��save����ִ����");
	}
	
	/**
	 * ������ٷ���
	 */
	public void destroy() {
		System.out.println("CustomerDaoImpl��������");
	}
}