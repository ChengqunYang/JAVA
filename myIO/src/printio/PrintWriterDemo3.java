package printio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ʹ�ô�ӡ�������ı��ļ�
 * 
 * ����Դ��FileWriterDemo.java		BufferedReader
 * Ŀ�ĵأ�a.txt						PrintWriter
 * 
 */
public class PrintWriterDemo3 {
	public static void main(String[] args) throws IOException {
		//��������������
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo.java"));
		//������ӡ������
		PrintWriter pw = new PrintWriter(new FileWriter("a.txt"),true);
		String line;
		while((line = br.readLine()) != null) {
			pw.println(line);
		}
		
		//�ͷ���Դ
		pw.close();
		br.close();
	}
}
