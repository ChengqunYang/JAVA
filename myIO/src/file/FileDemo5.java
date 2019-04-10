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
		
		//String[] list():���ص�ǰ·�������е��ļ����ļ�������
		//ע��ֻ��ָ���ļ��е�File������ܵ��ø÷���
		//String[] files = f.list();
		//for(int i = 0; i < files.length; i++) {
		//	System.out.println(files[i]);
		
		//File[] listFiles():���ص�ǰ·�������е��ļ����ļ��е�File����
		//File[] files = f.listFiles();
		//for (File file : files) {
		//	System.out.println(file.getName());
		
		//static File listRoots()  :�������е��̷�
		File[] files = File.listRoots();
		for (File file : files) {
			System.out.println(file);
		}
	}
}
