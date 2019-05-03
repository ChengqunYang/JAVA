package spring.demo1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	//注入DAO
	/*@Autowired
	@Qualifier(value="userDao") //强制让按名称来注入对象属性的值
*/	
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public void save() {
		System.out.println("UserService的save方法执行了");
		userDao.save();
	}
	
}
