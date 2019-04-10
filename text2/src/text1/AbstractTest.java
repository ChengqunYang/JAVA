package text1;

/*
 * 抽象类的特点：
 * 		抽象方法只能在抽象方法内
 * 		抽象类和抽象方法必须被abstract修饰
 * 		抽象类不能创建对象(不能实例化)
 * 		抽象类中可以有非抽象的方法
 * 		抽象类和类的关系也是继承
 * 		一个类继承了抽象类，要么重写所有的抽象方法,要么它也是一个抽象类
 */
public class AbstractTest {
	public static void main(String[] args) {
		//Anmial a = new Animal();
	}

}
abstract class Animal {
	public abstract void eat();
	public void run(){
	
	}
}
class Cat extends Animal{

	@Override   //注解 表明这个方法是对父类方法的重写
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}