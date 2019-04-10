package myexception;

import java.awt.print.PrinterAbortException;

/*
 * Throwable的常用方法：
 * 		String getMessage()
 * 		String toString()
 * 		void printStackTrace()
 * \
 * 
 * 选中代码：右击选择surround with 快捷生成try catch 语句
 */

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			System.out.println(2 / 0);
		} catch(ArithmeticException e) {
			//String getMessage()   :原因
			System.out.println(e.getMessage());
			//String toString()    :类型和运行
			System.out.println(e.toString());
			//void printStackTrace()  :类型原因和位置
			e.printStackTrace();
		}
	}
}
