package file;

import java.io.File;
import java.io.IOException;

/*
 * 创建功能
 * 				boolean createNewFlie()
 * 				boolean mkdir()
 * 				boolean mkdirs()
 * 	删除功能
 * 				boolean delete()
 * 
 * 绝对路径：固定不可改变的路径，以盘符开头
 * 相对路径：相对某个参照物，不能以盘符开头
 * 				在eclipse中相对路径相对应当前项目的根目录
 * 
 * 
 * 注意：删除一个文件夹不能有子文件和子文件夹
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		//File f = new File("d:\\a\\b,txt");  //绝对路径
		//File f2 = new File("a.txt");  //相对路径
		
		//boolean createNewFile():  当指定文件不存在时创建文件，并返回true，否则返回false
		//System.out.println(f2.createNewFile());
		
		//boolean mkdir()   :当指定文件夹不存在时创建文件，并返回true，否则返回false
		File f3 = new File("b");
		//System.out.println(f3.mkdir());
		
		//boolean mkdirs() :创建指定文件夹，当指定的文件夹的父文件夹不存在时也创建父文件夹
		File f4 = new File("c\\d\\e");
		//System.out.println(f4.mkdirs());
		//boolean delete()  :删除指定的文件或文件夹当指定的文件文件夹存在时删除并返回true，不存在时返回false
		System.out.println(f3.delete());
		System.out.println(f4.delete());
	}

}
