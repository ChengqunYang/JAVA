package myio1;

import java.io.FileWriter;
import java.io.IOException;

/*
 * void write(String str):дһ���ַ�������
 * void write(String str,int index,int len):дһ���ַ�����һ��������
 * void write(int ch):дһ���ַ����ݣ�����дint���͵ĺô��Ǽȿ���дchar���͵�����Ҳ����дchar���Ͷ�Ӧ��int ���� ������a:97��
 * void write(cahr[] chs):дһ���ַ���������
 * void write(char[] chs,int index,int len)��дһ���ַ������һ��������
 */
public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("b.txt");
		
		//void write(String str):дһ���ַ�������
		//fw.write("abcde");
		
		//void write(String str,int index,int len):дһ���ַ�����һ��������
		//fw.write("abcde",0,5);
		//fw.write("abcde",1,3);
		
		//void write(int ch):дһ���ַ����ݣ�����дint���͵ĺô��Ǽȿ���дchar���͵�����Ҳ����дchar���Ͷ�Ӧ��int ���� ������a:97��
		//fw.write('a');
		//fw.write(97);
		
		//void write(cahr[] chs):дһ���ַ���������
		char[] chs = {'a','b','c','d','e'};
		//fw.write(chs);
		
		//void write(char[] chs,int index,int len)��дһ���ַ������һ��������
		fw.write(chs, 2, 3);
		//�ͷ�����
		fw.close();
	}

}
