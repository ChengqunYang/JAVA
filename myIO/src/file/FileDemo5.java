package file;

import java.io.File;

/*
 *  String[] list()
 *  File[] listFiles()
 *  static File listRoots()
 */
public class FileDemo5 {
	public static void main(String[] args) {
		File f  = new File("d:");
		File f2 = new File("a.txt");
		
		//String[] list():返回当前路径下所有的文件和文件夹名称
		//注意只有指向文件夹的File对象才能调用该方法
		//String[] files = f.list();
		//for(int i = 0; i < files.length; i++) {
		//	System.out.println(files[i]);
		
		//File[] listFiles():返回当前路径下所有的文件和文件夹的File对象
		//File[] files = f.listFiles();
		//for (File file : files) {
		//	System.out.println(file.getName());
		
		//static File listRoots()  :返回所有的盘符
		File[] files = File.listRoots();
		for (File file : files) {
			System.out.println(file);
		}
	}
}
