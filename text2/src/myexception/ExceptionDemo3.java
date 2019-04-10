package myexception;

import java.io.FileWriter;
import java.io.IOException;

/*
 * finally:���try catch���ʹ�������ͷ���Դ����β����������try catch ������ִ�У�finally���һ����ִ��
 *  try {
 *  	�п��ܳ����쳣
 *  } catch(�쳣����) {
 * 		 �����쳣
 *  }finally {
 *  	�ͷ���Դ
 *  	��������
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
			System.out.println("��������Ϊ0");
		} finally {
			System.out.println("��������");
		}
	}
}
