package dao.inter;

/**
 * ����������ݿ�ķ���
 *
 */
public interface UserDao {
/**
 * ����idȥ���¾�����û���
 * @param uid
 * @param username
 */
	void update(int uid,String username);
/**
 * ɾ������:
 * @param uid
 */
	void delete(int uid);
/**
 * ִ�����
 * @param uid
 * @param username
 * @param password
 * @param phone
 */
	void insert( int uid ,String username,String password,String phone);
/**
 * ��ѯ����:
 */
	void findAll();

/**
 * ��¼����:
 * @param username
 * @param password
 */
	void login(String username,String password);

}
