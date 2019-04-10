package myexception;

import java.awt.print.PrinterAbortException;

/*
 * Throwable�ĳ��÷�����
 * 		String getMessage()
 * 		String toString()
 * 		void printStackTrace()
 * \
 * 
 * ѡ�д��룺�һ�ѡ��surround with �������try catch ���
 */

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			System.out.println(2 / 0);
		} catch(ArithmeticException e) {
			//String getMessage()   :ԭ��
			System.out.println(e.getMessage());
			//String toString()    :���ͺ�����
			System.out.println(e.toString());
			//void printStackTrace()  :����ԭ���λ��
			e.printStackTrace();
		}
	}
}
