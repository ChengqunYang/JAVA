package myio1;

import java.io.FileWriter;
import java.io.IOException;

/*\n����ʵ�ֻ��У�����windowsʶ��Ļ��в���\n����\r\n
 * 		windows:\r\n
 *		Linux:\n
 * 		mac:\r
 */
/*
 * Ҫ�����ļ�����׷�����ݾͲ���ʹ��FileWriter(String FileName)
 * ʹ����һ�����캯��
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
