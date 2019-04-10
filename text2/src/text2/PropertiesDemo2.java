package text2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/*
 * Properties��IO����ϵĹ���
 * 			void list(PrintWriter out)
 * 			void load(Reader reader) 
 * 			void store(Writer writer, String comments) 
  
 */
public class PropertiesDemo2 {
	public static void main(String[] args) throws IOException {
		//method();
		//method2();
		//���������б����
		Properties prop = new Properties(); 
		//���ӳ���ϵ
		prop.setProperty("001", "zhangsan");
		prop.setProperty("002", "lisi");
		prop.setProperty("003", "wangwu");
		System.out.println(prop);
		//�������������
		FileWriter fw = new FileWriter("a.txt");
		//void store(Writer writer, String comments)
		prop.store(fw, "ѧ����");
		//�ͷ���Դ
		fw.close();
	}

	private static void method2() throws FileNotFoundException, IOException {
		//���������б����
		Properties prop = new Properties();
		//����һ������������
		FileReader fr = new FileReader("a.txt");
		//void load(Reader reader)  
		prop.load(fr);
		//�ͷ���Դ
		fr.close();
		
		System.out.println(prop);
	}

	private static void method() throws FileNotFoundException {
		//���������б����
		Properties prop = new Properties(); 
		//���ӳ���ϵ
		prop.setProperty("001", "zhangsan");
		prop.setProperty("002", "lisi");
		prop.setProperty("003", "wangwu");
		//������ӡ������
		PrintWriter out = new PrintWriter("a.txt");
		//void list(PrintWriter out)
		prop.list(out);
		
		//�ͷ���Դ
		out.close();
	}
}
