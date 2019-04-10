package file;

import java.io.File;

/*
 * File：文件和目录路径的抽象表现形式，File类的实例不可改变
 * 
 * 构造方法：
 * 		File(File parent,String child)
 * 		File(String pathname)
 * 		File(String parent,String child)
 * 
 * 
 * Flie的常用功能：
 * 		创建功能
 * 				boolean createNewFlie()
 * 				boolean mkdir()
 * 				boolean mkdirs()
 * 		删除功能
 * 				boolean delete()
 * 		获取功能
 * 				File getAbsoluteFile()
 * 				String getAbsolutePath()
 * 				String getName()
 * 				String getParent()
 * 				File getParentFile()
 * 				String getPath()
 * 				long lastModified()
 * 				long length()
 * 		判断功能
 * 				boolean exists()
 * 				boolean isAbsolute()
 * 				boolean isDirectory()
 * 				boolean isFile()
 * 				boolean isHidden()
 * 		修改方法
 * 				boolean renameTo(File dest)
 */
public class FileDemo {
	public static void main(String[] args) {
		//构造方法：
		
		//File(String pathname) :将指定的路径名转换为一个File对象
		File f = new File("D:\\a\\b.txt");
		//仅仅指向，并不做别的操作，如指定文件不存在也不会创造也不会出错
		//Flie(String parant,string child) :根据指定的父路径和文件路径创建File对象
		File f2 = new File("D:\\a","b.txt");
		
		//File f3 = new File(File parent,String child):  根据指定的父路径和文件路径创建File对象
		File parent = new File("D:\\a");
		File f3 = new File(parent,"b.txt");
	}
}
