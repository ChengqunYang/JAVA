package printio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ�������й��ܣ�
 * 			�Զ�����:��ʹ�÷���println()ʵ���Զ�����
 * 			�Զ�ˢ��:  ����PrintWriter����ʱ�����Զ�ˢ�¿��أ�������ʹ��Println��������������ʵ���Զ�ˢ��
 * 
 * ע�⣺����FileWriter����ʱ��boolean�������Ƿ�׷�ӣ�
 * 		 ������ӡ������ʱ��boolean�������Ƿ�ˢ��
 */

public class PrintWriterDemo2 {
	public static void main(String[] args) throws IOException {
		//������ӡ������
		//PrintWriter pw = new PrintWriter("a.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("a.txt",true),true);
		//��д����
		pw.write("hello");
		pw.write("java");
		pw.write("world");
		
		pw.println("aaa");
		pw.println("bbb");
		//�ͷ���Դ ,�����Զ�ˢ��
		//pw.close();
	}
}
