package iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * 需求：读取键盘录入的数据，并输出到项目根目录下的a.txt中
 * 
 * 数据源：读取键盘录入的数据    System.in
 * 目的地：项目根目录下的a.txt文件中 FileWriter
 * 
 * 转换流：把字节输入流转换成字符输入流：InputStreamReader
 */

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//method();
		//创建输入流对象
		InputStream is = System.in;
		Reader r = new InputStreamReader(is);
		
		//创建输出流对象
		FileWriter fw = new FileWriter("a.txt");
		//读写数据
		char[] chs = new char[1024];
		int len;
		while((len = r.read(chs)) != -1) {
			fw.write(chs, 0, len);
			fw.flush();
		}
		
		//释放资源
		fw.close();
		is.close();
	}

	private static void method() throws IOException {
		//创建输入流对象
		InputStream is = System.in;
		
		//创建输出流对象
		FileWriter fw = new FileWriter("a.txt");
		//读写数据
		byte[] bys = new byte[1024];
		int len;
		while((len = is.read(bys)) != -1) {
			fw.write(new String(bys, 0, len));
			fw.flush();
		}
		
		//释放资源
		fw.close();
		is.close();
	}
}
