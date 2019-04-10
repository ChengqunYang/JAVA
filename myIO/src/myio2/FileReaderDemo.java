package myio2;

/*
 * 读数据：
 * 		int read():一次读取一个字符
 */
import java.io.FileReader;
import java.io.IOException;

/*
 * 从文件中读数据并显示到控制台
 * 		读数据---输入流---FileReader
 * FileReader:
 * 		 FileReader(String fileName):传递文件名称
 * 
 * 输入流读文件的步骤：
 * 		A：创建输入流对象
 * 		B：调用输入流对象的读数据方法
 * 		c：释放资源
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
	//创建输入流对象
		//FileReader fr = new FileReader("fr.txt");
		FileReader fr = new FileReader("FileWriterDemo.java");
		//调用输入流对象的读数据方法
		//int read():一次读取一个字符，返回字符对应的int值
		
		/*int ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		
		//第二次读数据
		ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		*/
	//读数据时当读取数据的返回值是-1，就说明没有数据了
		int ch;
		while((ch=fr.read())!=-1){
			System.out.print((char)ch);
		}
		//释放资源
		fr.close();
	}
}
