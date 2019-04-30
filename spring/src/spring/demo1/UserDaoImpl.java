package spring.demo1;

/**
 * 用户管理Dao层实现类
 */
public class UserDaoImpl implements UserDao{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void save() {
		System.out.println("UserService执行了..."+name);
		
	}

}
