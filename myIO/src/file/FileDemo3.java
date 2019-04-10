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
		
		//boolean exists() :�ж��ļ������ļ����Ƿ���ڣ���������򷵻�true,����������򷵻�false
		System.out.println(f.exists());
		
		//boolean isAbosulte() :�ж�File����ָ��Ķ����Ƿ��Ǿ���·��������Ƿ���true���򷵻�false
		System.out.println(f.isAbsolute());
		
		File f2 = new File("c");
		//boolean isDirectory() :�ж�File����ָ���·���Ƿ����ļ��У�����Ƿ���true,������Ƿ���false
		System.out.println(f2.isDirectory());
		//boolean isFile()	���ж�File����ָ���·���Ƿ����ļ��������Ƿ���true��������Ƿ���false
		System.out.println(f.isFile());
		
		//boolean isHidden()  //�ж�File����ָ���·���Ƿ����������ԣ���������˷���true�����򷵻�false
		System.out.println(f.isHidden());
	}
}
