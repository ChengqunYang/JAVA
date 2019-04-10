package file;

import java.io.File;
import java.util.Date;

/*
 * 获取功能:
 * 			File getAbsoluteFile()
 * 			String getAbsolutePath()
 * 			String getName()
 * 			String getParent()
 *			File getParentFile()
 *			String getPath()
 * 			long lastModified()
 * 			long length()
 * 修改方法:
 * 			boolean renameTo(File dest)
 */
public class FileDemo4 {
	public static void main(String[] args) {
		File f = new File("a.txt");
		File f2 = new File("c","d");
		File f3 = new File("c","e");
		
		
		//File getAbsulateFile();     //以File对象的形式返回当前File对象所指向的绝对路径
		//String getAbsulatePath();  //返回File对象所指向的绝对路径
		//System.out.println(f.getAbsoluteFile());
		//System.out.println(f.getAbsolutePath());
		
		//String getParent()  :返回File对象的父路径
		//File getParentFile() ：以File对象的形式返回当前File对象的父路径
		//System.out.println(f2.getParent()); 
		//System.out.println(f2.getParentFile());
		
		//String getName()  //获取文件或者文件夹的名称
		//String getPath()  //获取创建File对象时给的路径
		//long lastModified() //以毫秒值的形式返回最后修改时间
		//long length()   //返回文件的字节数
		System.out.println(f.getName());
		System.out.println(f2.getName());
		
		System.out.println(f.getPath());
		System.out.println(f2.getPath());
		
		System.out.println(f.lastModified());
		Date d  = new Date(1542860824778l);
		System.out.println(d.toLocaleString());
		
		System.out.println(f.length());
		System.out.println(f2.length());//无法通过这个方法获取文件夹的字节数
		
		//boolean renameTo(File dest) :将当前File对象所指向的路径 修改为制定File所指向的路径
		//注意：修改的文件的路径不能存在，若果存在则修改失败
		System.out.println(f2.renameTo(f3));
	}
}
