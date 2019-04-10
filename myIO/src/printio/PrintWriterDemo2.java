package printio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 打印流的特有功能：
 * 			自动换行:　使用方法println()实现自动换行
 * 			自动刷新:  创建PrintWriter对象时启动自动刷新开关，并且在使用Println等三个方法可以实现自动刷新
 * 
 * 注意：创建FileWriter对象时的boolean参数是是否追加，
 * 		 创建打印流对象时的boolean参数是是否刷新
 */

public class PrintWriterDemo2 {
	public static void main(String[] args) throws IOException {
		//创建打印流对象
		//PrintWriter pw = new PrintWriter("a.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("a.txt",true),true);
		//读写数据
		pw.write("hello");
		pw.write("java");
		pw.write("world");
		
		pw.println("aaa");
		pw.println("bbb");
		//释放资源 ,会先自动刷新
		//pw.close();
	}
}
