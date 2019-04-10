package myio1;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：往文件中写数据
 * 		  写数据--输出流--FileWriter
 * FileWriter:
 * 		 FlieWriter(String fileName):传递一个文件名称
 * 
 * 输出流写数据的步骤：
 * 		A：创建输出流对象
 * 		B：调用输出流对象的写数据方法,并刷新缓冲区
 * 		C：释放资源
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建输出流对象
		FileWriter fw = new FileWriter("a.txt");
		
		
		//写一个字符串数据
		fw.write("IO流你好");
		//数据没有直接写到文件实际是写到了内存缓冲区
		fw.flush();//刷新缓冲区
		fw.close();//释放资源时也会自动刷新缓冲区
	}

}
