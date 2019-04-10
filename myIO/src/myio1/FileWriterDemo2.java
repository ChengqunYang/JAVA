package myio1;

import java.io.FileWriter;
import java.io.IOException;

/*
 * void write(String str):写一个字符串数据
 * void write(String str,int index,int len):写一个字符串的一部分数据
 * void write(int ch):写一个字符数据，这里写int类型的好处是既可以写char类型的数据也可以写char类型对应的int 类型 的数据a:97。
 * void write(cahr[] chs):写一个字符数组数据
 * void write(char[] chs,int index,int len)：写一个字符数组的一部分数据
 */
public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("b.txt");
		
		//void write(String str):写一个字符串数据
		//fw.write("abcde");
		
		//void write(String str,int index,int len):写一个字符串的一部分数据
		//fw.write("abcde",0,5);
		//fw.write("abcde",1,3);
		
		//void write(int ch):写一个字符数据，这里写int类型的好处是既可以写char类型的数据也可以写char类型对应的int 类型 的数据a:97。
		//fw.write('a');
		//fw.write(97);
		
		//void write(cahr[] chs):写一个字符数组数据
		char[] chs = {'a','b','c','d','e'};
		//fw.write(chs);
		
		//void write(char[] chs,int index,int len)：写一个字符数组的一部分数据
		fw.write(chs, 2, 3);
		//释放数据
		fw.close();
	}

}
