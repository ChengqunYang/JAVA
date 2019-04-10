package text1;

/*
 * 类与类：继承关系，单一继承，多层继承
 * 类与接口：实现关系，多实现
 * 接口与接口关系：继承关系，多继承
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.function();
		d.method();
		d.methodC();
	}
}
interface InterA{
	public abstract void method();
	
}
interface InterB{
	public abstract void function();
	
}
interface InterC extends InterB,InterA{
	public abstract void methodC();
}

class Demo implements InterC{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		System.out.println("我是接口InterB的函数重写");
		
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("我是接口InterA的函数重写");		
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("我是接口InterC的函数重写");
	}

}