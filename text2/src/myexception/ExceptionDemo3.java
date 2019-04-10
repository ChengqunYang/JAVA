package myexception;

import java.io.FileWriter;
import java.io.IOException;

/*
 * finally:组合try catch语句使用用于释放资源等收尾工作，无论try catch 语句如何执行，finally语句一定会执行
 *  try {
 *  	有可能出现异常
 *  } catch(异常对象) {
 * 		 处理异常
 *  }finally {
 *  	释放资源
 *  	清理垃圾
 *  }
 */

public class ExceptionDemo3 {
	public static void main(String[] args) {
		//method();
		FileWriter fw = null;
		try {
			fw = new FileWriter("a.txt");
			fw.write("hello");
			fw.write("world");
			System.out.println(2/0);
			fw.write("java");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	private static void method() {
		try {
			System.out.println(2/0);
		} catch(ArithmeticException e) {
			System.out.println("除数不能为0");
		} finally {
			System.out.println("清理垃圾");
		}
	}
}
