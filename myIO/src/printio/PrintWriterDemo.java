package printio;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * 打印流：
 * 		PrintStream:
 * 		PrintWriter:
 * 			打印流可以自动换行：println
 * 			不能输出字节但可以输出其他任意类型
 * 			通过某些配置，可实现自动刷新(只有在调用println,printf,format时才有用)
 * 			也是包装流，不具备写出功能
 * 			可以把字节输出流转化为字符输出流
 * 注意：打印流只能输出不能输入
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建打印流对象
		PrintWriter pw = new PrintWriter("a.txt");
		//写出数据
		pw.write("hello");
		pw.write("world");
		pw.write("java");
		//释放资源
		pw.close();
		
	}
}
