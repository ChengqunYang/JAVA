package file2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * IO�����ࣺ
 * 			����
 * 				������	��ȡ����		FileReader ���ࣺ Reader
 * 				�����	д������		FileWriter ���ࣺ Writer
 * 			�������ͣ�
 * 				�ֽ���
 * 						�ֽ�������	��ȡ���� 	IntputStream
 * 						�ֽ������	д������		OutputStream
 * 				�ַ���
 * 						�ַ�������	��ȡ����		Reader
 * 						�ַ������	д������		Writer
 * 
 * ʹ���ַ��������ı��ļ�
 * 		����Դ�� IODemo.java
 * 		Ŀ�ĵأ�d:\\IODemo.java
 * 		
 */

public class IODemo {
	public static void main(String[] args) throws IOException {
		//�����ַ�����������
		FileReader fr = new FileReader("Copy.java");
		//�����ַ����������
		FileWriter fw = new FileWriter("d:\\IODemo.java");
		/*
		//һ�ζ�дһ���ַ�
		int ch;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
			fw.flush();
		}*/
		
		//һ�ζ�дһ���ַ�����
		int len;
		char[] chs = new char[1024];
		while((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}
		
		//�ͷ���Դ
		fw.close();
		fr.close();
	}
}