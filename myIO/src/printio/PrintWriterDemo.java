package printio;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ����
 * 		PrintStream:
 * 		PrintWriter:
 * 			��ӡ�������Զ����У�println
 * 			��������ֽڵ��������������������
 * 			ͨ��ĳЩ���ã���ʵ���Զ�ˢ��(ֻ���ڵ���println,printf,formatʱ������)
 * 			Ҳ�ǰ�װ�������߱�д������
 * 			���԰��ֽ������ת��Ϊ�ַ������
 * ע�⣺��ӡ��ֻ�������������
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		//������ӡ������
		PrintWriter pw = new PrintWriter("a.txt");
		//д������
		pw.write("hello");
		pw.write("world");
		pw.write("java");
		//�ͷ���Դ
		pw.close();
		
	}
}
