package spring.demo1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	//ע��DAO
	/*@Autowired
	@Qualifier(value="userDao") //ǿ���ð�������ע��������Ե�ֵ
*/	
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public void save() {
		System.out.println("UserService��save����ִ����");
		userDao.save();
	}
	
}
