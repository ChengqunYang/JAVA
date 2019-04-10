package printio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 使用打印流复制文本文件
 * 
 * 数据源：FileWriterDemo.java		BufferedReader
 * 目的地：a.txt						PrintWriter
 * 
 */
public class PrintWriterDemo3 {
	public static void main(String[] args) throws IOException {
		//创建输入流对象
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo.java"));
		//创建打印流对象
		PrintWriter pw = new PrintWriter(new FileWriter("a.txt"),true);
		String line;
		while((line = br.readLine()) != null) {
			pw.println(line);
		}
		
		//释放资源
		pw.close();
		br.close();
	}
}
