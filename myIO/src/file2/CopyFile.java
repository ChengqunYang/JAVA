package file2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 采用字节流的方法复制文本文件
 * 
 * 数据源：Copy.java
 * 目的地：a.txt
 */

public class CopyFile {
	public static void main(String[] args) throws IOException {
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("Copy.java");
		//创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("a.txt");
		
		//一次读写一个字节
		int by;
		while((by = fis.read()) != -1) {
			fos.write(by);
		}
		//一次读写一个字节数组
		int len;
		byte[] bys = new byte[1024];
		while((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
		//释放资源
		fis.close();
		fos.close();
	}
}
