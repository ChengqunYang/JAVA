package myio2;

import java.io.FileReader;
import java.io.IOException;

/*
 * 输入流读数据的步骤：
 * 		A:创建输入流对象
 * 		B:调用输入流对象读数据方法
 * 		C:释放资源
 */

public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		//创建流对象
		FileReader fr = new FileReader("fr2.txt");
		
		/*
		//调用输入流对象的读数据方法
		//int read(char[] cbuf):一次读取一个字符数组的数据
		char[] chs = new char[5];
		
		//第一次读数据
		int len = fr.read(chs);
		System.out.println("len:"+len);
		System.out.println(new String(chs,0,len));
		//第二次读数据
		len = fr.read(chs);
		//返回的len是实际读取的字符的个数
		System.out.println("len:"+len);
		System.out.println(new String(chs,0,len));
		
		*/
		//char[] chs = new char[5];
		char[] chs = new char[1024];//这里可以是1024的整数倍
		int len;
		while((len=fr.read(chs))!=-1){
			System.out.print(new String(chs,0,len));
		}
		fr.close();
		
	}
}
