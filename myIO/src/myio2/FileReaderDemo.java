package myio2;

/*
 * �����ݣ�
 * 		int read():һ�ζ�ȡһ���ַ�
 */
import java.io.FileReader;
import java.io.IOException;

/*
 * ���ļ��ж����ݲ���ʾ������̨
 * 		������---������---FileReader
 * FileReader:
 * 		 FileReader(String fileName):�����ļ�����
 * 
 * ���������ļ��Ĳ��裺
 * 		A����������������
 * 		B����������������Ķ����ݷ���
 * 		c���ͷ���Դ
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
	//��������������
		//FileReader fr = new FileReader("fr.txt");
		FileReader fr = new FileReader("FileWriterDemo.java");
		//��������������Ķ����ݷ���
		//int read():һ�ζ�ȡһ���ַ��������ַ���Ӧ��intֵ
		
		/*int ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		
		//�ڶ��ζ�����
		ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		*/
	//������ʱ����ȡ���ݵķ���ֵ��-1����˵��û��������
		int ch;
		while((ch=fr.read())!=-1){
			System.out.print((char)ch);
		}
		//�ͷ���Դ
		fr.close();
	}
}
