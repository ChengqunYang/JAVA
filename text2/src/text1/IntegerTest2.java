package text1;

/*
 * JDK1.5特性：自动装箱(基本数据类型转换为包装类对象采用构造创建对象即可)和拆箱(包装类对象转换为基本数据类型如integer
 * 的intvalue方法)
 */
public class IntegerTest2 {
	public static void main(String[] args) {
		//Integer i = new Integer(10);
		
		//自动装箱
		//相当于：Integer i = new Integer(10);
		//Integer i = 10;
		//自动拆箱
		//相当于int a = i.intvalue();
		//Integer i = 10;
		//int a = i;
		
		
		Integer i = 10;
		Integer i2 =  20;
		Integer i3 = i + i2;
		
	}
}
