package spring.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 用户DAO的实现类
 * @author DELL
 *
 */
@Component(value="userDao")//相当于<bean id="userDao" class="spring.demo1.UserDaoImpl"/>
public class UserDaoImpl implements UserDao {
	private String name;
	
	@Value("李明")  //如果有set方法则将注解加到set方法上，如果没有set方法则直接将加到属性上。
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void save() {
		System.out.println("Dao中保存用户的方法执行了..."+name);

	}

}
