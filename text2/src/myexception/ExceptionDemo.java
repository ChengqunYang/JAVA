package myexception;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) throws IOException {
		try {
		System.out.println(10 / 0);  //����ʱ�Ĵ���
		
		//FileWriter fw = new FileWriter("a.txt");  //����ʱ�Ĵ���
		
			String s = null;
			System.out.println(s.length());  //java.lang.NullPointerException
		} catch(NullPointerException e) {
			System.out.println("���ֿ�ָ���쳣��");
		} catch(Exception e) {
			System.out.println("�����쳣��");
		}
	
		try {	

			int[] arr = new int[5];
			System.out.println(arr[8]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ����");
		}
		
		
	}
}
