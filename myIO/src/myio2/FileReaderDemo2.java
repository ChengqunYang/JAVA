package myio2;

import java.io.FileReader;
import java.io.IOException;

/*
 * �����������ݵĲ��裺
 * 		A:��������������
 * 		B:������������������ݷ���
 * 		C:�ͷ���Դ
 */

public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		//����������
		FileReader fr = new FileReader("fr2.txt");
		
		/*
		//��������������Ķ����ݷ���
		//int read(char[] cbuf):һ�ζ�ȡһ���ַ����������
		char[] chs = new char[5];
		
		//��һ�ζ�����
		int len = fr.read(chs);
		System.out.println("len:"+len);
		System.out.println(new String(chs,0,len));
		//�ڶ��ζ�����
		len = fr.read(chs);
		//���ص�len��ʵ�ʶ�ȡ���ַ��ĸ���
		System.out.println("len:"+len);
		System.out.println(new String(chs,0,len));
		
		*/
		//char[] chs = new char[5];
		char[] chs = new char[1024];//���������1024��������
		int len;
		while((len=fr.read(chs))!=-1){
			System.out.print(new String(chs,0,len));
		}
		fr.close();
		
	}
}
