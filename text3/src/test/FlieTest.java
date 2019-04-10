package test;

import java.io.File;

/*
 * 需求：输出指定目录下所有的java文件名（包含子目录）
 */
public class FlieTest {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\DELL\\Desktop\\java练习\\text2\\src");
		method(f);
	}
	
	public static void method(File file) {
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				//判断是否是文件对象
				if(f.isFile()) {
					if(f.getName().endsWith(".java")) {
						System.out.println(f.getName());
					}
				}else {
					//是一个文件的话
					method(f);
				}
				
			}
		}
	}

}
