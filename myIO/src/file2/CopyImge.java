package file2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 分别使用字符流和字节流复制图片
 */

public class CopyImge {
	public static void main(String[] args) throws IOException {
		//method();
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("a.jpg");
		//创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("d:\\a.jpg");
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

	//采用字符流的方法并不能够完成图片等二进制文件
	//文本文件的复制既可以采取字节流也可以采取字符流
	private static void method() throws FileNotFoundException, IOException {
		//创建字符输入流对象
		FileReader fr = new FileReader("a.jpg");
		
		//创建字符输出流对象
		FileWriter fw = new FileWriter("d:\\a.jpg");
		
		//一次读写一个字符数组的方式
		int len;
		char[] chs = new char[1024];
		while((len = fr.read()) != -1) {
			fw.write(chs, 0, len);
			fw.flush();
		}
		//释放资源
		fr.close();
		fw.close();
	}
}