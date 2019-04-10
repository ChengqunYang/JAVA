package text1;

public class ExtendsTest {
	public static void main(String[] args) {
		Son s = new Son();
		s.function();
		
	}
}
class Did{
	int num = 10;
	public Did(){
		System.out.println("我是父类无参构造");
		
	}
	public Did(int num){
		System.out.println("我是父类有参构造");
	}
	public void method(){
		System.out.println("我是父类的方法");
	}
}
class Son extends Did{
	int num = 30;
	public Son(){
		super(10);
		System.out.println("我是子类无参构造");
	}
	public Son(int num){
		System.out.println("我是子类有参构造");
	}
	public void method(){
		System.out.println("我是子类方法");
	}
	public void function(){
		this.num = 50;
		System.out.println(num);
	}
}

