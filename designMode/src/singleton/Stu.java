package singleton;

/**
 * 单例模式:饿汉式
 * @author DELL
 *
 */
public class Stu {
	private Stu() {
		
	}   
	//将构造方法私有化,就不能再new该类的对象了
	private static Stu stu = new Stu();
	//静态的生成一个私有对象,静态代码只能执行一次,所以只会生成一个对象
	public static Stu getInstance() {
		return stu;
	//让类直接调用静态公开方法返回在加载时生成的唯一的对象
	}
}
