package file2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ֱ�ʹ���ַ������ֽ�������ͼƬ
 */

public class CopyImge {
	public static void main(String[] args) throws IOException {
		//method();
		//�����ֽ�����������
		FileInputStream fis = new FileInputStream("a.jpg");
		//�����ֽ����������
		FileOutputStream fos = new FileOutputStream("d:\\a.jpg");
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

	//�����ַ����ķ��������ܹ����ͼƬ�ȶ������ļ�
	//�ı��ļ��ĸ��Ƽȿ��Բ�ȡ�ֽ���Ҳ���Բ�ȡ�ַ���
	private static void method() throws FileNotFoundException, IOException {
		//�����ַ�����������
		FileReader fr = new FileReader("a.jpg");
		
		//�����ַ����������
		FileWriter fw = new FileWriter("d:\\a.jpg");
		
		//һ�ζ�дһ���ַ�����ķ�ʽ
		int len;
		char[] chs = new char[1024];
		while((len = fr.read()) != -1) {
			fw.write(chs, 0, len);
			fw.flush();
		}
		//�ͷ���Դ
		fr.close();
		fw.close();
	}
}