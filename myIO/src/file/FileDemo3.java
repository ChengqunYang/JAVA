package file;

import java.io.File;

/*
 * 		boolean exists()
 * 		boolean isAbsolute()
 *		boolean isDirectory()
 * 		boolean isFile()
 * 		boolean isHidden()
 */
public class FileDemo3 {
	public static void main(String[] args) {
		File f = new File("a.txt");
		
		//boolean exists() :判断文件或者文件夹是否存在，如果存在则返回true,如果不存在则返回false
		System.out.println(f.exists());
		
		//boolean isAbosulte() :判断File对象指向的对象是否是绝对路径，如果是返回true否则返回false
		System.out.println(f.isAbsolute());
		
		File f2 = new File("c");
		//boolean isDirectory() :判断File对象指向的路径是否是文件夹，如果是返回true,如果不是返回false
		System.out.println(f2.isDirectory());
		//boolean isFile()	：判断File对象指向的路径是否是文件，若果是返回true，如果不是返回false
		System.out.println(f.isFile());
		
		//boolean isHidden()  //判断File对象指向的路径是否有隐藏属性，如果隐藏了返回true，否则返回false
		System.out.println(f.isHidden());
	}
}
