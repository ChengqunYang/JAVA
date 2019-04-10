package file2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * IO流分类：
 * 			流向：
 * 				输入流	读取数据		FileReader 父类： Reader
 * 				输出流	写出数据		FileWriter 父类： Writer
 * 			数据类型：
 * 				字节流
 * 						字节输入流	读取数据 	IntputStream
 * 						字节输出流	写出数据		OutputStream
 * 				字符流
 * 						字符输入流	读取数据		Reader
 * 						字符输出流	写出数据		Writer
 * 
 * 使用字符流复制文本文件
 * 		数据源： IODemo.java
 * 		目的地：d:\\IODemo.java
 * 		
 */

public class IODemo {
	public static void main(String[] args) throws IOException {
		//创建字符输入流对象
		FileReader fr = new FileReader("Copy.java");
		//创建字符输出流对象
		FileWriter fw = new FileWriter("d:\\IODemo.java");
		/*
		//一次读写一个字符
		int ch;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
			fw.flush();
		}*/
		
		//一次读写一个字符数组
		int len;
		char[] chs = new char[1024];
		while((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}
		
		//释放资源
		fw.close();
		fr.close();
	}
}