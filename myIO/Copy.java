package myio1;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �������ļ���д����
 * 		  д����--�����--FileWriter
 * FileWriter:
 * 		 FlieWriter(String fileName):����һ���ļ�����
 * 
 * �����д���ݵĲ��裺
 * 		A���������������
 * 		B����������������д���ݷ���,��ˢ�»�����
 * 		C���ͷ���Դ
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//�������������
		FileWriter fw = new FileWriter("a.txt");
		
		
		//дһ���ַ�������
		fw.write("IO�����");
		//����û��ֱ��д���ļ�ʵ����д�����ڴ滺����
		fw.flush();//ˢ�»�����
		fw.close();//�ͷ���ԴʱҲ���Զ�ˢ�»�����
	}

}
