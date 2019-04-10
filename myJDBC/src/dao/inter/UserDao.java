package dao.inter;

/**
 * 定义操作数据库的方法
 *
 */
public interface UserDao {
/**
 * 根据id去更新具体的用户名
 * @param uid
 * @param username
 */
	void update(int uid,String username);
/**
 * 删除方法:
 * @param uid
 */
	void delete(int uid);
/**
 * 执行添加
 * @param uid
 * @param username
 * @param password
 * @param phone
 */
	void insert( int uid ,String username,String password,String phone);
/**
 * 查询所有:
 */
	void findAll();

/**
 * 登录方法:
 * @param username
 * @param password
 */
	void login(String username,String password);

}
