package iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * ���󣺶�ȡ����¼������ݣ����������Ŀ��Ŀ¼�µ�a.txt��
 * 
 * ����Դ����ȡ����¼�������    System.in
 * Ŀ�ĵأ���Ŀ��Ŀ¼�µ�a.txt�ļ��� FileWriter
 * 
 * ת���������ֽ�������ת�����ַ���������InputStreamReader
 */

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//method();
		//��������������
		InputStream is = System.in;
		Reader r = new InputStreamReader(is);
		
		//�������������
		FileWriter fw = new FileWriter("a.txt");
		//��д����
		char[] chs = new char[1024];
		int len;
		while((len = r.read(chs)) != -1) {
			fw.write(chs, 0, len);
			fw.flush();
		}
		
		//�ͷ���Դ
		fw.close();
		is.close();
	}

	private static void method() throws IOException {
		//��������������
		InputStream is = System.in;
		
		//�������������
		FileWriter fw = new FileWriter("a.txt");
		//��д����
		byte[] bys = new byte[1024];
		int len;
		while((len = is.read(bys)) != -1) {
			fw.write(new String(bys, 0, len));
			fw.flush();
		}
		
		//�ͷ���Դ
		fw.close();
		is.close();
	}
}
