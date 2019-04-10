package text1;
/*
 * 需求：
 * 		判断一个数是否符合int类型的范围
 * int类型的范围-2的31次到2的31次-1
 * 
 * 
 * 由于基本数据类型只能做一些简单的操作和运算，所以java为我们封装了基本数据类型，为每种基本数据类型提供了包装类
 * 包装类就是封装了基本数据类型的类，为我们提供了更多的复杂的方法和一些变量
 * 
 * 
 * byte		Byte
 * short	Short
 * char		Character
 * int 		Integet
 * long		Long
 * Float	Float
 * double	Double
 * boolean	Boolean
 * 
 * Integer:
 * 		String --- int
 * 		方式1：int intvalue();
 * 		方式2：static int parseInt(String s)
 * 		int ---String
 * 		方式1：+ “ ”
 * 		方式2：String toString()
 * 
 * 构造方法：
 * 		Integer(int value)
 * 		Integer(String s)
 * 
 */
public class IntegerTest {
	public static void main(String[] args) {
	/*	int n = 10;
		if(n >= Math.pow(-2, 31) && n <= Math.pow(2, 31)-1)
		{
			System.out.println("符合");
		}
		else
		{
			System.out.println("不符合");
		}
		*/
		//Integer i = new Integer("10");
		//System.out.println(i);
		//int intvalue()
		//int a = i.intValue();
		//System.out.println(a+10);
		
		
		//int b = Integer.parseInt("10");
		//System.out.println(b);
		
		//Integer(int value)
		//Integer i2 = new Integer(40);
		//String s = i2.toString();
		//System.out.println(s);
		
		//static String int toString(int i)
		String s2 = Integer.toString(50);
		System.out.println(s2);
	}
		

} 