package myio3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 要求：
 * 		把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中
 * 
 * 数据源：
 * FileWriterDemo.java ---读数据---FileReader
 * 
 * 目的地：
 * Copy.java---写数据---FileWriter
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//创建输入流对象
		FileReader fr = new FileReader("FileWriterDemo.java");
		//创建输出流对象
		FileWriter fw = new FileWriter("Copy.java");
		
		//读写数据
		int ch;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}

}
