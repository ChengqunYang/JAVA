package myio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：
 *	把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中
 * 
 * 数据源：
 * FileWriterDemo.java---读数据---FileReader---高效的读数据---BufferedReader
 * 目的地：
 * Copy.java---写数据---FileWriter---高效的写数据---BufferedWriter
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo.java"));
		//创建输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		
		
		//读写数据
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//释放资源
		bw.close();
		br.close();
	}

}
