package file2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����ֽ����ķ��������ı��ļ�
 * 
 * ����Դ��Copy.java
 * Ŀ�ĵأ�a.txt
 */

public class CopyFile {
	public static void main(String[] args) throws IOException {
		//�����ֽ�����������
		FileInputStream fis = new FileInputStream("Copy.java");
		//�����ֽ����������
		FileOutputStream fos = new FileOutputStream("a.txt");
		
		//һ�ζ�дһ���ֽ�
		int by;
		while((by = fis.read()) != -1) {
			fos.write(by);
		}
		//һ�ζ�дһ���ֽ�����
		int len;
		byte[] bys = new byte[1024];
		while((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
		//�ͷ���Դ
		fis.close();
		fos.close();
	}
}
