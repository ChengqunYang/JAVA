package text2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/*
 * Properties和IO流结合的功能
 * 			void list(PrintWriter out)
 * 			void load(Reader reader) 
 * 			void store(Writer writer, String comments) 
  
 */
public class PropertiesDemo2 {
	public static void main(String[] args) throws IOException {
		//method();
		//method2();
		//创建属性列表对象
		Properties prop = new Properties(); 
		//添加映射关系
		prop.setProperty("001", "zhangsan");
		prop.setProperty("002", "lisi");
		prop.setProperty("003", "wangwu");
		System.out.println(prop);
		//创建输出流对象
		FileWriter fw = new FileWriter("a.txt");
		//void store(Writer writer, String comments)
		prop.store(fw, "学生表");
		//释放资源
		fw.close();
	}

	private static void method2() throws FileNotFoundException, IOException {
		//创建属性列表对象
		Properties prop = new Properties();
		//创建一个输入流对象
		FileReader fr = new FileReader("a.txt");
		//void load(Reader reader)  
		prop.load(fr);
		//释放资源
		fr.close();
		
		System.out.println(prop);
	}

	private static void method() throws FileNotFoundException {
		//创建属性列表对象
		Properties prop = new Properties(); 
		//添加映射关系
		prop.setProperty("001", "zhangsan");
		prop.setProperty("002", "lisi");
		prop.setProperty("003", "wangwu");
		//创建打印流对象
		PrintWriter out = new PrintWriter("a.txt");
		//void list(PrintWriter out)
		prop.list(out);
		
		//释放资源
		out.close();
	}
}
