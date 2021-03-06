package singleton;

/**
 * 单例模式:懒汉式
 * @author DELL
 *
 */
public class Stu01 {
	private Stu01() {
		
	}
	//将构造方法私有化,就不能再new该类的对象了
	private static Stu01 stu01;
	//定义一个私有的静态对象   
	public static Stu01 getInstance() {
		if(stu01 == null){
			stu01 = new Stu01();
		}
		return stu01;
	}
	//让类直接调用静态公开方法,判断先前定义的stu01是否为空,如果为空那么new一个对象给他并返回,如果不为空则直接返回
}
