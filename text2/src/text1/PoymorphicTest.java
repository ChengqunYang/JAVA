package text1;

/*
 * 多态的前提：
 * 		子父类的继承关系
 * 		方法的重写
 * 		父类引用指向子类对象
 * 
 * 动态绑定：运行期间调用的方法，是根据其具体类型
 * 	
 * 多态的成员特点：
 * 	成员变量
 * 			编译时看的左边，运行时看的还是左边，变量没有重写的概念
 *  成员方法
 *  		编译时看左边，运行时看右边
 *  静态方法
 *  		使用变量去调用静态方法，其实相当于用变量类型的类名去调用
 *  		编译时看左边，运行时还看左边
 *  
 *  多态的优缺点：
 *  	缺点：无法直接访问子类特有的成员
 *  	优点：可以提高可维护性，提高代码的可扩展性
 */
public class PoymorphicTest {
	public static void main(String[] args) {
		Dad d = new Kid();
		System.out.println(d.num);
		d.method();
		d.function();
	}
}
class Dad {
	int num = 20;
	public void method() {
		System.out.println("我是父类的方法");
		
	}
	public static void function() {
		System.out.println("我是父类的静态方法");
	}
}
class Kid extends Dad {
	int num = 10;
	public void method() {
		System.out.println("我是子类的方法");
	}
	public static void function() {
		System.out.println("我是子类的静态方法");
	}
}