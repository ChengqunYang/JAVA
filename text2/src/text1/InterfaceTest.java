package text1;
/*
 * 
 * 接口的成员特点：
 * 		只能有抽象方法
 * 		默认使用abstract和public修饰方法
 * 		只能用abstract和public修饰方法
 * 		接口中只能有常量（默认使用public final static修饰）
 * 接口不能创建对象（不能实例化）
 * 类和接口的关系是实现关系，一个类实现一个接口必须实现它所有的方法
 */
public class InterfaceTest {
	public static void main(String[] args) {
		//Animal a = new Animal();
		Cat1 a = new Cat1();
		a.eat();
	}
}

interface Animal1 {
	public abstract void eat();
}
class Cat1 implements Animal1 {

	@Override
	public void eat() {
	System.out.println("吃");
	}
	
}