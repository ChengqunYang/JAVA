package myexception;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) throws IOException {
		try {
		System.out.println(10 / 0);  //运行时的错误
		
		//FileWriter fw = new FileWriter("a.txt");  //编译时的错误
		
			String s = null;
			System.out.println(s.length());  //java.lang.NullPointerException
		} catch(NullPointerException e) {
			System.out.println("出现空指针异常了");
		} catch(Exception e) {
			System.out.println("出现异常了");
		}
	
		try {	

			int[] arr = new int[5];
			System.out.println(arr[8]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界了");
		}
		
		
	}
}
