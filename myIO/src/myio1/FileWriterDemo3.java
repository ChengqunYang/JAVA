package myio1;

import java.io.FileWriter;
import java.io.IOException;

/*\n可以实现换行，但是windows识别的换行不是\n而是\r\n
 * 		windows:\r\n
 *		Linux:\n
 * 		mac:\r
 */
/*
 * 要是往文件里面追加数据就不能使用FileWriter(String FileName)
 * 使用另一个构造函数
 * FileWriter(String filename,boolean append)
 * 
 */

public class FileWriterDemo3 {
	public static void main(String[] args) throws IOException {
		//FileWriter fw = new FileWriter("c.txt");
		FileWriter fw = new FileWriter("c.txt",true);
		
		for(int x=0; x<10; x++){
			fw.write("hello"+x);
			fw.write("\r\n");
		}
		fw.close();
	}

}
