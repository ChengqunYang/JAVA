package text1;
/*
package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello World");
		Scanner in = new Scanner(System.in);
		System.out.println("重复：" + in.next());
		System.out.println(2 + 3);
		int a = in.nextInt();
		System.out.println(a);
	}
}
/*
public class PrimitiveTypeTest {  
    public static void main(String[] args) {  
        // byte  
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);  
        System.out.println("包装类：java.lang.Byte");  
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);  
        System.out.println("包装类：java.lang.Short");  
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
        System.out.println("包装类：java.lang.Integer");  
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);  
        System.out.println("包装类：java.lang.Long");  
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);  
        System.out.println("包装类：java.lang.Float");  
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);  
        System.out.println("包装类：java.lang.Double");  
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
        System.out.println("包装类：java.lang.Character");  
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("最小值：Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("最大值：Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
    }  
}*/
public class StaticTest {
	private static int staticInt = 2;
	private int random = 2;

	public StaticTest() {
		staticInt++;
		random++;
	}

	public static void main(String[] args) {
		System.out.println("类变量与对象变量的值变化");
		StaticTest test = new StaticTest();
		System.out.println("  实例1：staticInt:" + StaticTest.staticInt + "----random:" + test.random);
		StaticTest test2 = new StaticTest();
		System.out.println("  实例2：staticInt:" + StaticTest.staticInt + "----random:" + test2.random);
		System.out.println("静态变量赋值");
		System.out.println("  静态语句块起作用:" + A.staticA);
		System.out.println("  构造器起作用:" + A.staticA);
		A.toChange();
		System.out.println("  静态方法1起作用:" + A.staticA);
		A.toChange2();
		System.out.println("  静态方法2起作用:" + A.staticA);
		System.out.println("常量赋值");
		System.out.println("  静态语句赋值:" + B.staticB);
	}
}

class A { 
	public static  String  staticA ="A" ;  
	//静态语句块修改值 
	static{  staticA ="A1"; } 
	//构造器修改值
	public A (){  staticA ="A2"; } 
	//静态方法起作用 
	
	public static void toChange(){  staticA ="A3"; } 
	public static void toChange2(){  staticA ="A4"; }  
}

class B { 
	public static final String  staticB ;  // 声明与赋值分离 
	static{  staticB ="B"; }
}

/*
public class StaticTest {
private static int staticInt = 2;
private int random = 2;

public StaticTest() {
	staticInt++;
	random++;
}

public static void main(String[] args) {
	System.out.println("类变量与对象变量的值变化");
	StaticTest test = new StaticTest();
	System.out.println("  实例1：staticInt:" + test.staticInt + "----random:" + test.random);
	StaticTest test2 = new StaticTest();
	System.out.println("  实例2：staticInt:" + test.staticInt + "----random:" + test.random);
	System.out.println("静态变量赋值");
	System.out.println("  静态语句块起作用:" + A.staticA);
	A a = new A();
	System.out.println("  构造器起作用:" + a.staticA);
	a.toChange();
	System.out.println("  静态方法1起作用:" + A.staticA);
	a.toChange2();
	System.out.println("  静态方法2起作用:" + A.staticA);
	System.out.println("常量赋值");
	System.out.println("  静态语句赋值:" + B.staticB);
}
}

class A { 
public static  String  staticA ="A" ;  
//静态语句块修改值 
static{  staticA ="A1"; } 
//构造器修改值
public A (){  staticA ="A2"; } 
//静态方法起作用 

public static void toChange(){  staticA ="A3"; } 
public static void toChange2(){  staticA ="A4"; }  
}

class B { 
public static final String  staticB ;  // 声明与赋值分离 
static{  staticB ="B"; }
}
*/