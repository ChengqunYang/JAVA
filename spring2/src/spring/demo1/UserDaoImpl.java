package spring.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * �û�DAO��ʵ����
 * @author DELL
 *
 */
@Component(value="userDao")//�൱��<bean id="userDao" class="spring.demo1.UserDaoImpl"/>
public class UserDaoImpl implements UserDao {
	private String name;
	
	@Value("����")  //�����set������ע��ӵ�set�����ϣ����û��set������ֱ�ӽ��ӵ������ϡ�
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void save() {
		System.out.println("Dao�б����û��ķ���ִ����..."+name);

	}

}