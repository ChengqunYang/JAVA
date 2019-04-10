package myio3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Ҫ��
 * 		����Ŀ·���µ�FileWriterDemo.java�е����ݸ��Ƶ���Ŀ·���µ�Copy.java��
 * 
 * ����Դ��
 * FileWriterDemo.java ---������---FileReader
 * 
 * Ŀ�ĵأ�
 * Copy.java---д����---FileWriter
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//��������������
		FileReader fr = new FileReader("FileWriterDemo.java");
		//�������������
		FileWriter fw = new FileWriter("Copy.java");
		
		//��д����
		int ch;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}

}
