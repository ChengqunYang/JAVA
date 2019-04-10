package myio6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 复制文本文件（五种方式）
 * 
 * 
 * 数据源：
 * 		FileWriterDemo.java
 * 目的地：
 * 		Copy.java
 */
public class CopyFileTest {
	public static void main(String[] args) throws IOException {
		/*
		method1("FileWriterDemo.java","Copy.java");
		method2("FileWriterDemo.java","Copy.java");
		method3("FileWriterDemo.java","Copy.java");
		method4("FileWriterDemo.java","Copy.java");
		method5("FileWriterDemo.java","Copy.java");
		*/
		String srcFileName = "FileWriterDemo.java";
		String destFileName = "Copy.java";
		
//		method1(srcFileName,destFileName);
//		method2(srcFileName,destFileName);
//		method3(srcFileName,destFileName);
//		method4(srcFileName,destFileName);
		method5(srcFileName,destFileName);
		
	}
	//基本流一次读写一个字符
	public static void method1(String srcFileName,String destFileName) throws IOException{
		
		//创建输入流对象
		FileReader fr = new FileReader(srcFileName);
		//创建输出流对象
		FileWriter fw = new FileWriter(destFileName);
		
		//一次读写一个字符
		int ch;
		while((ch=fr.read())!=-1){
			
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}
	//基本流一次读写一个字符数组
	public static void method2(String srcFileName,String destFileName) throws IOException{
		
		//创建输入流对象
		FileReader fr = new FileReader(srcFileName);
		//创建输出流对象
		FileWriter fw = new FileWriter(destFileName);
		
		//一次读写一个字符数组
		char chs[] = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1){
			
			fw.write(chs, 0, len);
		}
		fw.close();
		fr.close();
	}
	//缓冲流一次读写一个字符
		public static void method3(String srcFileName,String destFileName) throws IOException{
			
			//创建输入流对象
			BufferedReader br= new BufferedReader(new FileReader(srcFileName));
			//创建输出流对象
			BufferedWriter bw = new BufferedWriter(new FileWriter(destFileName));
			
			//一次读写一个字符
			int ch;
			while((ch=br.read())!=-1){
				
				bw.write(ch);
			}
			bw.close();
			br.close();
		}
	//缓冲流一次读写一个字符数组
		public static void method4(String srcFileName,String destFileName) throws IOException{
			
			//创建输入流对象
			BufferedReader br= new BufferedReader(new FileReader(srcFileName));
			//创建输出流对象
			BufferedWriter bw = new BufferedWriter(new FileWriter(destFileName));
			
			//一次读写一个字符数组
			int len;
			char chs[] = new char[1024];
			while((len=br.read(chs))!=-1){
				
				bw.write(chs,0,len);
			}
			bw.close();
			br.close();
		}
		//缓冲流一次读写一个字符串
				public static void method5(String srcFileName,String destFileName) throws IOException{
					
					//创建输入流对象
					BufferedReader br= new BufferedReader(new FileReader(srcFileName));
					//创建输出流对象
					BufferedWriter bw = new BufferedWriter(new FileWriter(destFileName));
					
					//一次读写一个字符串
					String line;
					while((line=br.readLine())!=null){
						bw.write(line);
						bw.newLine();
						bw.flush();
					}
				
					bw.close();
					br.close();
				}
}
