package spring.demo1;

/**
 * �û�����Dao��ʵ����
 */
public class UserDaoImpl implements UserDao{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void save() {
		System.out.println("UserServiceִ����..."+name);
		
	}

}
