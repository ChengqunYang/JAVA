package text1;

//import java.util.Scanner;

public class MethodTest {
	public static boolean compare(byte a ,byte b)
	{
		System.out.println("byte");
		return a == b;
	}
	public static boolean compare(int a ,int b)
	{
		System.out.println("int");
		return a == b;
	}
	public static boolean compare(long a ,long b)
	{
		System.out.println("long");
		return a == b;
	}
	public static boolean compare(short a ,short b)
	{
		System.out.println("short");
		return a == b;
	}
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		System.out.println(compare(10l,20l));
	}
}
