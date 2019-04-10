package iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * ����
 * 		��ȡ��Ŀ��Ŀ¼�µ�Copy.java,�������������
 * 	����Դ��	��Ŀ��Ŀ¼�µ�SystemInOutDemo.java  ���ø�Ч��BufferedReader
 * 	Ŀ�ĵأ������� System.out
 * ���ڱ�׼�������һ���ֽ������������ֻ������ֽڻ����ַ����飬�������Ƕ�ȡ�����������ַ�����
 * ���������������Ҫת��Ϊ�ֽ�����ǳ�������
 * ����Ҫ��ͨ����׼���������ַ������ѱ�׼�����ת����һ���ַ���������ɣ�
 * ת������OutputStreamWriter
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//method();
		//method2();
		//����������
		BufferedReader br = new BufferedReader(new FileReader("Copy.java"));
		//���������
		//OutputStream os = System.out;
		
		//Writer w = new OutputStreamWriter(System.out);
		//BufferedWriter bw = new BufferedWriter(w);
		//��������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//�������ݵĶ�д
		String line; //���ڴ洢��ȡ��������
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		//�ͷ���Դ
		bw.close();
		br.close();		
	}

	private static void method2() throws FileNotFoundException, IOException {
		//����������
		BufferedReader br = new BufferedReader(new FileReader("Copy.java"));
		//���������
		//OutputStream os = System.out;
		Writer w = new OutputStreamWriter(System.out);
		
		//�������ݵĶ�д
		String line; //���ڴ洢��ȡ��������
		while((line = br.readLine()) != null) {
			w.write(line);
			w.write("\r\n");
		}
		//�ͷ���Դ
		w.close();
		br.close();
	}

	private static void method() throws FileNotFoundException, IOException {
		//����������
		BufferedReader br = new BufferedReader(new FileReader("Copy.java"));
		//���������
		OutputStream os = System.out;
		
		String line; //���ڴ洢��ȡ��������
		while((line = br.readLine()) != null) {
			os.write(line.getBytes());
			os.write("\r\n".getBytes());
		}
		//�ͷ���Դ
		os.close();
		br.close();
	}
}
