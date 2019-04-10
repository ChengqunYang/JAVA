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
 * 需求：
 * 		读取项目根目录下的Copy.java,并输出到命令行
 * 	数据源：	项目根目录下的SystemInOutDemo.java  采用高效的BufferedReader
 * 	目的地：命令行 System.out
 * 由于标准输出流是一个字节输出流，所以只能输出字节或者字符数组，但是我们读取到的数据是字符串，
 * 如果想进行输出，还要转换为字节数组非常不方便
 * 我们要想通过标准输出流输出字符串，把标准输出流转换成一种字符输出流即可，
 * 转换流：OutputStreamWriter
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//method();
		//method2();
		//创建输入流
		BufferedReader br = new BufferedReader(new FileReader("Copy.java"));
		//创建输出流
		//OutputStream os = System.out;
		
		//Writer w = new OutputStreamWriter(System.out);
		//BufferedWriter bw = new BufferedWriter(w);
		//匿名对象
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//进行数据的读写
		String line; //用于存储读取到的数据
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		//释放资源
		bw.close();
		br.close();		
	}

	private static void method2() throws FileNotFoundException, IOException {
		//创建输入流
		BufferedReader br = new BufferedReader(new FileReader("Copy.java"));
		//创建输出流
		//OutputStream os = System.out;
		Writer w = new OutputStreamWriter(System.out);
		
		//进行数据的读写
		String line; //用于存储读取到的数据
		while((line = br.readLine()) != null) {
			w.write(line);
			w.write("\r\n");
		}
		//释放资源
		w.close();
		br.close();
	}

	private static void method() throws FileNotFoundException, IOException {
		//创建输入流
		BufferedReader br = new BufferedReader(new FileReader("Copy.java"));
		//创建输出流
		OutputStream os = System.out;
		
		String line; //用于存储读取到的数据
		while((line = br.readLine()) != null) {
			os.write(line.getBytes());
			os.write("\r\n".getBytes());
		}
		//释放资源
		os.close();
		br.close();
	}
}
